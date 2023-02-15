/*String Palindrome
  -----------------
Given a string, determine if it is a palindrome, considering only alphanumeric characters.

Palindrome:
A palindrome is a word, number, phrase, or other sequences of characters which read the same backwards and forwards.
Example:
If the input string happens to be, "malayalam" then as we see that this word can be read the same as forward and backwards, it is said to be a valid palindrome.

The expected output for this example will print, 'true'.
From that being said, you are required to return a boolean value from the function that has been asked to implement.

Sample Input 1 :
abcdcba

Sample Output 1 :
true 

Sample Input 2:
coding

Sample Output 2:
false
*/

package strings;

import java.util.Scanner;

public class CheckPalindromeString {
	
	public static boolean isPalindrome(String str) {
		int i = 0;
		int j = str.length() - 1;
		while(i < j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			} else {
				i++;
				j--;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(isPalindrome(str));

	}

}
