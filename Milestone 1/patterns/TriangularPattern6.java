/*
Input:
5

Output:
5
45
345
2345
12345

*/

package patterns;

import java.util.Scanner;

public class TriangularPattern6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int i=1;
		while(i<=n) {
			int p=n-i+1;
			
			int j=1;
			while(j<=i) {
//				int p=n-i+j;			-->2nd approach
				System.out.print(p);
				p++;
				j+=1;
			}
			System.out.println();
			i+=1;
		}
		
	}

}
