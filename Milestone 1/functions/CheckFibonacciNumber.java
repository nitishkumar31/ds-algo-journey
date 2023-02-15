/*Fibonacci Number
  ----------------
Given a number N, figure out if it is a member of fibonacci series or not. Return true if the number is member of fibonacci series else false.

Fibonacci Series is defined by the recurrence
    F(n) = F(n-1) + F(n-2)
where F(0) = 0 and F(1) = 1

Input Format :
Integer N

Output Format :
true or false

Constraints :
0 <= n <= 10^4

Sample Input 1 :
5

Sample Output 1 :
true

Sample Input 2 :
14

Sample Output 2 :
false    
 */

package functions;

import java.util.Scanner;

public class CheckFibonacciNumber {
	public static boolean checkNumber(int n) {
		int a=0, b=1, c;
		if(n==0 || n==1) {
			return true;
		}
		for(int i=1; i<=n; i++) {
			c=a+b;
			a=b;
			b=c;
			if(c==n) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(checkNumber(n));
		
	}

}
