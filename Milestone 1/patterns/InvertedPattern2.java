/*
Input:
5

Output:
55555
4444
333
22
1

*/

package patterns;

import java.util.Scanner; 

public class InvertedPattern2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n-i+1) {
				System.out.print(n-i+1);
				
				j+=1;
			}
			System.out.println();
			i+=1;
		}

	}

}
