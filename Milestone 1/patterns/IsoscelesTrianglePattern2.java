/*
Input:
5

Output:
    *
   ***
  *****
 *******
*********

*/

package patterns;

import java.util.Scanner;

public class IsoscelesTrianglePattern2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=1;
		while(i<=n) {
			int sp = 1;
			while(sp<=n-i) {
				System.out.print(" ");
				sp++;
			}
			
			int stars=1;
			while(stars<=2*i-1) {
				System.out.print("*");
				stars++;
			}
			
//			int stars=1;
//			while(stars<=i) {
//				System.out.print("*");
//				stars++;
//			}
//													--> Another Approach
//			int decr=i-1;
//			while(decr>=1) {
//				System.out.print("*");
//				decr--;
//			}
			
			System.out.println();
			i++;
		}

	}

}
