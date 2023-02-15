/*Reverse String Wordwise
  -----------------------
Reverse the given string word wise. That is, the last word in given string should come at 1st place, last second word at 2nd place and so on.
Individual words should remain as it is.

Sample Input 1:
Welcome to Coding Ninjas

Sample Output 1:
Ninjas Coding to Welcome

Sample Input 2:
Always indent your code

Sample Output 2:
code your indent Always
*/

package strings;

import java.util.Scanner;

public class ReverseStringWordWise {
	
	public static String reverseStringWordWise(String str) {		
		String ans = "";
		int start, end = str.length();
		int i, j;
		for(i=str.length()-1; i>=0; i--) {
			if(str.charAt(i) == ' ') {
				start = i+1;
				String word = "";
				for(j = start; j < end; j++) {
					word += str.charAt(j);
				}
				ans += word + " ";
				end = i;
			}
		}
		String word = "";
		for(j = 0; j < end; j++) {
			word += str.charAt(j);
		}
		ans += word;
		return ans;
		
		// Another approach by using substring() method
//		int end = str.length();
//		String ans = "";
//		int i;
//		for (i = str.length()-1; i>=0; i--) {
//			if(str.charAt(i) == ' ') {
//				ans += str.substring(i + 1, end) + " ";
//				end = i;
//			}
//		}
//		ans += str.substring(i + 1, end);
//		return ans;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(reverseStringWordWise(str));
	}

}
