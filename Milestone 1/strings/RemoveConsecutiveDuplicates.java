/*Remove Consecutive Duplicates
  -----------------------------
For a given string(str), remove all the consecutive duplicate characters.

Example:
Input String: "aaaa"
Expected Output: "a"

Input String: "aabbbcc"
Expected Output: "abc"

Note:
You are not required to print anything. It has already been taken care of.

Sample Input 1:
aabccbaa

Sample Output 1:
abcba

Sample Input 2:
xxyyzxx

Sample Output 2:
xyzx
*/

package strings;

import java.util.Scanner;

public class RemoveConsecutiveDuplicates {
	
	public static String removeConsecutiveDuplicates(String str) {
		String result = "";
		result += str.charAt(0);
		int k = 0;
		for(int i=0; i < str.length(); i++) {
			if(str.charAt(i) != result.charAt(k)) {
				result += str.charAt(i);
				k++;
			}
		}
		return result;
		
	// Another approach (but here last character of consecutive duplicate characters are printed)
//		String result = "";
//		int i;
//		for(i=0; i < str.length()-1; i++) {
//			if(str.charAt(i) != str.charAt(i+1)) {
//				result += str.charAt(i);
//			}
//			
//		}
//		result += str.charAt(i);
//		System.out.println(i);
//		return result;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(removeConsecutiveDuplicates(str));

	}

}
