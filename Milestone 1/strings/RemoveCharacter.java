/*Remove character
  ----------------
For a given a string(str) and a character X, write a function to remove all the occurrences of X from the given string.
The input string will remain unchanged if the given character(X) doesn't exist in the input string.

Note:
You are not required to print anything explicitly. It has already been taken care of.

Sample Input 1:
aabccbaa
a

Sample Output 1:
bccb

Sample Input 2:
xxyyzxx
y

Sample Output 2:
xxzxx
*/

package strings;

import java.util.Scanner;

public class RemoveCharacter {
	
	public static String removeCharacter(String str, char ch) {
		String str1 = "";
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) != ch) {
				str1 += str.charAt(i);
			}
		}
		
		return str1;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		char X = s.next().charAt(0);
		System.out.println(removeCharacter(str, X));

	}

}
