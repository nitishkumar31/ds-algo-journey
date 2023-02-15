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

public class TriangularPattern4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=i) {
				System.out.print(j);
				j+=1;
			}
			System.out.println();
			i+=1;
		}
		

	}

}
