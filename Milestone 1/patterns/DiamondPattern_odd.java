/*
Input:
5

Output:
  *
 ***
*****
 ***
  *

*/

package patterns;

import java.util.Scanner;

public class DiamondPattern_odd {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int n1 = (n+1)/2;
		int n2 = n/2;

		//First half
		int i = 1;
		while (i <= n1) {

			int sp = 1;
			while (sp <= n1 - i) {
				System.out.print(" ");
				sp++;
			}

			int j = 1;
			while (j <= 2*i - 1) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}

		//Second half
		i = n2;
		while (i >= 1) {
			
			int sp =1;
			while (sp<=(n2-i+1)){
				System.out.print(" ");
				sp++;
			}
			int j =1;
			while (j<=2*i - 1) {
				System.out.print("*");
				j++;
			}
			System.out.println();

			i--;

		}
	}

}


