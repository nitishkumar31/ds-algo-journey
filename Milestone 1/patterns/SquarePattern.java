/*
Input:
5

Output:
55555
55555
55555
55555
55555

*/

package patterns;

import java.util.Scanner;

public class SquarePattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n) {
				System.out.print(n);
				j+=1;
			}
			System.out.println();
			i+=1;
		}
		

	}

}
