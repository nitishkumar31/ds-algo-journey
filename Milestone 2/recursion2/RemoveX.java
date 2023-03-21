/*Remove X
  --------
Given a string, compute recursively a new string where all 'x' chars have been removed.

Input format :
String S

Output format :
Modified String

Constraints :
1 <= |S| <= 10^3
where |S| represents the length of string S. 

Sample Input 1 :
xaxb

Sample Output 1:
ab

Sample Input 2 :
abc

Sample Output 2:
abc

Sample Input 3 :
xx

Sample Output 3:

*/

package recursion2;

import java.util.Scanner;

public class RemoveX {
	
	public static String removeX(String str) {
		if(str.length() == 0)
			return str;
		
		String smallOutput = removeX(str.substring(1));
		if(str.charAt(0) == 'x') {
			return smallOutput;
		} else {
			return str.charAt(0) + smallOutput;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(removeX(str));
	}

}
