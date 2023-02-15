/*
Input 1:
10

Output 1:
    10
   810
  6810
 46810
246810
 46810
  6810
   810
    10

Input 2:
7

Output:
8
   8
  68
 468
2468
 468
  68
   8

*/

package patterns;

import java.util.Scanner;
public class HalfDiamondReverse_even {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if(n%2!=0) {
			n++;
			System.out.println(n);
		}

		int i,j,sp;
		for(i=n; i>=2 ; i=i-2) {
			
			for (sp=2; sp<=i-2; sp=sp+2) {
				System.out.print(" ");
			}
			
			for(j=i; j<=n; j=j+2) {
				System.out.print(j);
			}
			System.out.println();  
		}
		
		for(i=4; i<=n ; i=i+2) {
			
			for (sp=2; sp<=i-2; sp=sp+2) {
				System.out.print(" ");
			}
			
			for(j=i; j<=n; j=j+2) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
