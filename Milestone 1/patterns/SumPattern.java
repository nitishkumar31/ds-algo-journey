/*
Input:
5

Output:
1=1
1+2=3
1+2+3=6
1+2+3+4=10
1+2+3+4+5=15

*/

package patterns;

import java.util.Scanner;

public class SumPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i, j ,sum=0;
		for(i=1; i<=n; i++) {
			sum+=i;
			for(j=1; j<=i; j++) {
				
				System.out.print(j);
				if(j==i) {
					System.out.print("=");
				}
				else {
					System.out.print("+");
				}
			}
		System.out.println(sum);
		}
	}

}
