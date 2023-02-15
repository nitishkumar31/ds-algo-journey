/*All substrings
  --------------
For a given input string(str), write a function to print all the possible substrings.

Substring:
A substring is a contiguous sequence of characters within a string. 
Example: "cod" is a substring of "coding". Whereas, "cdng" is not as the characters taken are not contiguous

Sample Input 1:
abc

Sample Output 1:
a 
ab 
abc 
b 
bc 
c 

Sample Input 2:
co

Sample Output 2:
c 
co 
o
*/

package strings;

import java.util.Scanner;

public class PrintAllSubstrings {

	public static void printSubstrings(String str) {

		// 1st approach by creating a new string and print charaters in it
		for (int i = 0; i < str.length(); i++) {
			String subStr = "";
			for (int j = i; j < str.length(); j++) {
				subStr += str.charAt(j);
				System.out.println(subStr);
			}
		}

		// 2nd approach by printing characters
//		for (int i = 0; i < str.length(); i++) {
//			for (int j = i; j < str.length(); j++) {
//				for(int k = i; k <= j; k++){
//					System.out.print(str.charAt(k));
//				}
//				System.out.println();
//			}
//		}

		// 3rd approach by putting pre-defined substring() method
//		for (int i = 0; i < str.length(); i++) {
//			for (int j = i; j < str.length(); j++) {
//				System.out.println(str.substring(i, j + 1));
//			}
//		}
		
		// 4th approach by printing substrings according to their length
//		for(int len = 1; len<= str.length(); len++) {
//			for(int start = 0; start <=str.length() - len; start++) {
//				int end = start + len - 1;
//				System.out.println(str.substring(start, end + 1));
//			}
//		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		printSubstrings(str);
	}

}
