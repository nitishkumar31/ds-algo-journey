/*
Input:
3

Output:
1
23
456

Input 2:
5

Output 2:
1
23
456
78910
1112131415

*/

package patterns;

import java.util.Scanner;

public class TriangularPattern2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int p = 1;
		int i = 1;
		while(i<=n) {
			int j = 1;
			while(j<=i) {
				System.out.print(p);
				p+=1;
				j+=1;
			}
			System.out.println();
			i+=1;
		}
		

	}

}
