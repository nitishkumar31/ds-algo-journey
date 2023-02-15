/*
Input:
5

Output:
13579
35791
57913
79135
91357

*/

package patterns;

import java.util.Scanner;

public class OddSquarePattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i, j;
		for(i=1; i<=n; i++) {
			int value = 2*i-1;
			for(j=1; j<=n; j++) {
				System.out.print(value);
				value+=2;
				
				int maxVal = 2*n-1;
				if(value > maxVal) {
					value=1;
				}
				
			}
			System.out.println();
		}
		
	}

}
