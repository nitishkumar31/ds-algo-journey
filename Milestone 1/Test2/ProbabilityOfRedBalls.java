/*Probability
  -----------
An urn contains 8 balls : 4 red , 2 blue and 2 green. Now n balls are drawn out of the urn. 
Calculate the probability that out of n drawn balls exactly x balls are red.Find your answer 
multiplied by 100 and return the integer part.

All required values for computation will be in integer range.

x is always less than equal to 4 and x is always less than equal to n.

Input format :
Two spaced integers : n and x

Output format :
Integer part of (Probability * 100)

Sample Input 1 :
3 1

Sample Output 1:
42
*/

package Test2;
import java.util.*;

public class ProbabilityOfRedBalls {
	
	public static int factorial(int n) {
		int fact=1;
		for(int i=1; i<=n; i++) {
			fact*=i;
		}
		return fact;
	}
	
	public static int ncr(int n, int r) {
		int factn = factorial(n);
		int factr = factorial(r);
		int factnr = factorial(n-r);
		return factn/(factr*factnr);
	}
	
	public static int probability(int n, int x) {
		int fav = ncr(4,x) * ncr(4, n-x);
		int total = ncr(8,n);
		int ans = (fav*100)/total;
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int x=s.nextInt();
		System.out.println(probability(n,x));
	}

}
