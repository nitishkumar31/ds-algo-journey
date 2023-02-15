/*Binary to decimal
  -----------------
Given a binary number as an integer N, convert it into decimal and print.

Input format :
An integer N in the Binary Format

Output format :
Corresponding Decimal number (as integer)

Constraints :
0 <= N <= 10^9

Sample Input 1 :
1100

Sample Output 1 :
12

Sample Input 2 :
111

Sample Output 2 :
7
*/

package operators;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int ans = 0;
		int pv = 1;
		for(int i=n; i>0; i=i/10) {
			ans = ans + i%10 * pv;
			pv*=2;
		}
		System.out.println(ans);
	}

}
