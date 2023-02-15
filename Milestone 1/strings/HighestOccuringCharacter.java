/*Highest Occuring Character
  --------------------------
For a given a string(str), find and return the highest occurring character.

Example:
Input String: "abcdeapapqarr"
Expected Output: 'a'
Since 'a' has appeared four times in the string which happens to be the highest frequency character, the answer would be 'a'.
If there are two characters in the input string with the same frequency, return the character which comes first.

Consider:
Assume all the characters in the given string to be in lowercase always.

Sample Input 1:
abdefgbabfba

Sample Output 1:
b

Sample Input 2:
xy

Sample Output 2:
x
*/

package strings;

import java.util.Scanner;

public class HighestOccuringCharacter {
	
	public static char highestOccuringChar(String str) {
		int[] freq = new int[256];
		int maxFreq = 0;
		for(int i=0; i < str.length(); i++) {
			char ch = str.charAt(i);
			freq[ch]++;
			maxFreq = Math.max(maxFreq, freq[ch]);
		}
		char ans = '\0';
		for(int i=0; i < str.length(); i++) {
			if(freq[str.charAt(i)] == maxFreq){
				ans = str.charAt(i);
				break;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(highestOccuringChar(str));

	}

}
