/*Compress the String
  -------------------
Write a program to do basic string compression. For a character which is consecutively repeated more than once, replace consecutive duplicate occurrences with the count of repetitions.

Example:
If a string has 'x' repeated 5 times, replace this "xxxxx" with "x5".

The string is compressed only when the repeated character count is more than 1.

Note:
Consecutive count of every character in the input string is less than or equal to 9.

Sample Input 1:
aaabbccdsa

Sample Output 1:
a3b2c2dsa

Sample Input 2:
aaabbcddeeeee

Sample Output 2:
a3b2cd2e5
*/

package strings;

import java.util.Scanner;

public class CompressTheString {
	
	public static String getCompressedString(String input) {
		String result = "";
		for(int i=1; i <= input.length(); i++) {
			result += input.charAt(i-1);
			int count = 1;
			while(i < input.length() && input.charAt(i) == input.charAt(i-1)) {
				count++;
				i++;
			}
			if(count > 1) {
					result += count;
				}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(getCompressedString(str));

	}

}
