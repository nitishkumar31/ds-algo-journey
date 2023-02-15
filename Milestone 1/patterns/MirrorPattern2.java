/*
Input:
5

Output:
    1
   12
  123
 1234
12345

*/

package patterns;

import java.util.Scanner;

public class MirrorPattern2 {

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
				System.out.print(stars);
				stars++;
				
			}
			System.out.println();
			i++;
		}

	}

}
