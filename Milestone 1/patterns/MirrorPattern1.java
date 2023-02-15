/*
Input:
5

Output:
    *
   **
  ***
 ****
*****

*/

package patterns;

import java.util.Scanner;

public class MirrorPattern1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=1;
		while(i<=n) {
			int spaces=1;
			while(spaces<=n-i) {
				System.out.print(" ");
				spaces++;
			}
			int stars=1;
			while(stars<=i) {
				System.out.print("*");
				stars++;
			}
			System.out.println();
			i++;
		}

	}

}
