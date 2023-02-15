/*
Input:
5

Output:
*****
 *****
  *****
   *****
    *****

*/

package patterns;

import java.util.Scanner;

public class ParallelogramPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i,j,k;
		for(i=1; i<=n; i++) {
			for(j=1; j<=i-1; j++) {
				System.out.print(" ");
			}
			for(k=1; k<=n; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
