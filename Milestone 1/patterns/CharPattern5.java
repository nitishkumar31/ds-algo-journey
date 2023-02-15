/*
Input:
5

Output:
E
DE
CDE
BCDE
ABCDE

*/

package patterns;

import java.util.Scanner;

public class CharPattern5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int i=1;
		while(i<=n) {
			char ch = (char)('A'+n-i);
			int j=1;
			while(j<=i) {
				System.out.print(ch);
				ch++;
				j+=1;
			}
			System.out.println();
			i+=1;
		}

	}

}
