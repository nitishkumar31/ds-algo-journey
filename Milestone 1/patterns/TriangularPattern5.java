/*
Input:
5

Output:
1
22
333
4444
55555

*/

package patterns;

import java.util.Scanner;

public class TriangularPattern5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=i) {
				System.out.print(i);
				j+=1;
			}
			System.out.println();
			i+=1;
		}
		
	}

}
