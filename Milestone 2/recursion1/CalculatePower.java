/*Calculate Power
  ---------------
Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to return the answer.
Do this recursively.

Input format :
Two integers x and n (separated by space)

Output Format :
x^n (i.e. x raise to the power n)

Constraints :
0 <= x <= 30
0 <= n <= 30

Sample Input 1 :
3 4

Sample Output 1 :
81

Sample Input 2 :
2 5

Sample Output 2 :
32
*/

package recursion1;

import java.util.Scanner;

public class CalculatePower {
	
	public static int power(int x, int n) {
		if(n == 0) {
//			System.out.println(x+" "+n+" "+ 1);
			return 1;
		}
		
//		if(x == 0 && n == 0)
//			return 0;
//		
//		if(x == 0)
//			return 0;
		

		// Normal Approach
//		smallAns = x * power(x, n-1);
//		return smallAns;

		
		// Advance Approach
		int smallAns = power(x, n/2);
//		System.out.println(x+" "+n+" "+smallAns);
		if(n%2 == 0) {
//			System.out.println("if");
			return smallAns * smallAns;
		}
		else {
//			System.out.println("else");
			return x * smallAns * smallAns;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int n = s.nextInt();
		System.out.println(power(x, n));

	}

}
