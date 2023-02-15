/*Reverse of a number
  -------------------
Write a program to generate the reverse of a given number N. Print the corresponding reverse number.
Note : If a number has trailing zeros, then its reverse will not include them. For e.g., reverse of 10400 will be 401 instead of 00401.

Input format :
Integer N

Output format :
Corresponding reverse number

Constraints:
0 <= N < 10^8

Sample Input 1 :
1234

Sample Output 1 :
4321

Sample Input 2 :
1980

Sample Output 2 :
891
*/

package operators;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int rev=0;
		for(int i=n; i>0; i=i/10) {
			int temp = i%10;
			rev = rev*10 + temp;
		}
		System.out.println(rev);

	}

}
