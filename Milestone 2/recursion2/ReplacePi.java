/*Replace Pi with "3.14"
  ----------------------
Sample Input :
apiapipipiip

Sample Output :
a3.14a3.143.143.14ip
*/

package recursion2;

import java.util.Scanner;

public class ReplacePi {
	
	public static String replacePi(String str) {
		if(str.length() <= 1)
			return str;
		
		if(str.charAt(0) == 'p' && str.charAt(1) == 'i') {
			// call recursion on string of length n-2
			String smallOutput = replacePi(str.substring(2));
			return "3.14" + smallOutput;
		} else {
			// call recursion on string of length n-1
			String smallOutput = replacePi(str.substring(1));
			return str.charAt(0) + smallOutput;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(replacePi(str));
	}

}