/*
Input:
5

Output:
A
BB
CCC
DDDD
EEEEE

*/

package patterns;

import java.util.Scanner;

public class CharPattern2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=i) {
				char jthChar = (char)('A'+i-1);
				System.out.print(jthChar);
				j+=1;
			}
			System.out.println();
			i+=1;
		}

	}

}
