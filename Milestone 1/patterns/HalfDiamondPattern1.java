/*
Input:
5

Output:
*
*1*
*121*
*12321*
*1234321*
*123454321*
*1234321*
*12321*
*121*
*1*
*

*/

package patterns;

import java.util.Scanner;

public class HalfDiamondPattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i, j ,p;
		System.out.println("*");
		for(i=1; i<=n; i++) {
			System.out.print("*");
			for(j=1; j<=i; j++) {
				System.out.print(j);
			}
			for(p=(i-1); p>=1; p--) {
				System.out.print(p);
			}
			System.out.println("*");
		}

		for(i=(n-1); i>=1; i--) {
			System.out.print("*");
			for(j=1; j<=i;j++) {
				System.out.print(j);
			}
			for(p=(i-1); p>=1; p--) {
				System.out.print(p);
			}
			System.out.println("*");
		}
		System.out.println("*");

	}

}
