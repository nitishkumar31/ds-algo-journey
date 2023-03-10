/*Replace Character
  -----------------
*/

package recursion2;

import java.util.Scanner;

public class ReplaceCharacter {
	
	public static String replaceChar(String str, char a, char b) {
		if(str.length() == 0)
			return str;
		
		String smallOutput = replaceChar(str.substring(1), a, b);
		if(str.charAt(0) == a) {
			return b + smallOutput;
		} else {
			return str.charAt(0) + smallOutput;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		char a = s.next().charAt(0);
		char b = s.next().charAt(0);
		System.out.println(replaceChar(str, a, b));
	}

}
