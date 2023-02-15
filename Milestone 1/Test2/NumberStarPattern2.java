/*Number Star Pattern 2
  -------------------
Print the following pattern for given number of rows.

Input format :
Line 1 : N (Total number of rows)

Sample Input :
5

Sample Output :
1234554321
1234**4321
123****321
12******21
1********1
*/


package Test2;

import java.util.*;

public class NumberStarPattern2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int numStars = 0;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i+1; j++) {
				System.out.print(j);
			}
			for(int count=1; count<=numStars; count++) {
				System.out.print("*");
			}
			for(int j=n-i+1; j>=1; j--) {
				System.out.print(j);
			}
			System.out.println();
			numStars = numStars+2;
		}

	}

}
