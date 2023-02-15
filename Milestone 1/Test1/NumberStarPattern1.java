/*Number Star pattern 1
  ---------------------
Print the following pattern for given number of rows.

Input format :
Integer N (Total number of rows)

Output Format :
Pattern in N lines

Sample Input :
   5

Sample Output :
 5432*
 543*1
 54*21
 5*321
 *4321
*/

package Test1;

import java.util.Scanner;

public class NumberStarPattern1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		
		for(int i=1; i<=N; i++) {
			for(int j=N; j>=1; j--) {
				if(j==i)
					System.out.print("*");
				else
					System.out.print(j);
			}
			System.out.println();
		}

	}

}
