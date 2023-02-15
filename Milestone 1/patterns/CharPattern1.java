/*
Input:
5

Output:
ABCDE
ABCDE
ABCDE
ABCDE
ABCDE

*/

package patterns;

import java.util.Scanner;

public class CharPattern1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n) {
				char jthChar = (char)('A'+j-1);
				System.out.print(jthChar);
				j+=1;
			}
			System.out.println();
			i+=1;
		}

	}

}
