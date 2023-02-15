/*
Input:
5

Output:
    1
   121
  12321
 1234321
123454321

*/

package patterns;

import java.util.Scanner;

public class IsoscelesTrianglePattern1 {

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
			int num=1;
			while(num<=i) {
				System.out.print(num);
				num++;
			}
			int decr=i-1;
			while(decr>=1) {
				System.out.print(decr);
				decr--;
			}
			System.out.println();
			i++;
		}

	}

}
