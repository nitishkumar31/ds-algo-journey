/*
Input:
5

Output:
    1
   232
  34543
 4567654
567898765

*/

package patterns;

import java.util.Scanner;

public class IsoscelesTrianglePattern3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=1;
		while(i<=n) {
			int sp = 1;
			while(sp<=n-i) {
				System.out.print(" ");
				sp++;
			}
			int j=1;
			while(j<=i) {
				System.out.print(j+i-1);
				j++;
			}
			int k=i-1;
			while(k>=1) {
				System.out.print(k+i-1);
				k--;
			}
			System.out.println();
			i++;
		}

	}

}
