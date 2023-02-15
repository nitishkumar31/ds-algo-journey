/*Count Words
  -----------
For a given input string(str), find and return the total number of words present in it.
It is assumed that two words will have only a single space in between. Also, there wouldn't be any leading and trailing spaces in the given input string.

Note:
You are not required to print anything. It has already been taken care of.

Sample Input 1:
Coding Ninjas!

Sample Output 1:
2

Sample Input 2:
this is a sample string

Sample Output 2:
5
*/

package strings;

import java.util.Scanner;

public class CountWords {
	
	public static int countWords(String str) {
		if(str.length() == 0)
			return 0;
		
		int count = 1;
		for(int i=0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				count++;
			}
		}
		return count;
		
		// Another approach using split function
//		if(str.length() == 0)
//			return 0;
//		
//		String arr[] = str.split(" ");		// Split function is a function which will 
//		return arr.length;					// return us a new array of Strings.
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(countWords(str));
	}

}
