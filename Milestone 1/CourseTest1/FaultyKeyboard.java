/*Faulty Keyboard
  ---------------
Some of the keys on your keyboard are faulty. When you press a key, it may register more than once. That means if you want to type "code", the keyboard may interpret it as "code", "cccoddee" or "coode" or "codeeeee", etc. So, by pressing the keys C, O, D, and E in that order, you may get any of the above-mentioned words.
However, there are certain words that you will not get like, "cddde", "cod", "coeeeeed", etc.
You will be given 'N' pairs of words. The first word of each pair is what you intended to write and the second one is what the keyboard interprets it as. You need to figure out whether the second word can actually be a possible interpretation of the first word.

Input format:
The first line of the input contains a positive integer, N which represents the number of pairs of words
Every two lines after it will contain two words. The first one is what you typed, the second one is a potential interpretation of that word by the faulty keyboard.

Output format:
The output will contain 'N' lines. Each line will be either "true" if the second word is a possible interpretation of the first word and "false" if it's not.

Constraints
1 <= N <= 10^5
1 <= L <= 10^6
where L is the total number of letters in all of the 2*N words
Time limit: 1 sec

Sample Input 1
2
code
cooodeee
hello
hheeeloo

Sample Output 1
true
false
*/

package CourseTest1;

import java.util.Scanner;

public class FaultyKeyboard {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int t=0; t<n; t++) {
			String word = s.next();
			String testWord = s.next();
			String check1 = "", check2 = "";
			check1 += word.charAt(0);
			for(int i=1; i < word.length(); i++) {
				if(word.charAt(i) != word.charAt(i-1)) {
					check1 += word.charAt(i);
				}
			}
			
			check2 += testWord.charAt(0);
			for(int i=1; i < testWord.length(); i++) {
				if(testWord.charAt(i) != testWord.charAt(i-1)) {
					check2 += testWord.charAt(i);
				}
			}
			System.out.println(check2.equals(check1));
			
			
			 // another approach
	        // int n = ip.nextInt();
	        // for (int j = 0; j < n; j++) {
	        //   String T = ip.next(), check1 = "", check2 = "";
	        //   String SP = ip.next();
	        //   char lastWord1 = SP.charAt(0);
	        //   char lastWord2 = SP.charAt(0);
	        //   check1 += SP.charAt(0);
	        //   check2 += T.charAt(0);
	        //   for (int i = 0; i < T.length(); i++) {
	        //     if (lastWord1 != T.charAt(i)) {
	        //       check1 += T.charAt(i);
	        //       lastWord1 = T.charAt(i);
	        //     }
	        //   }
	        //   for (int i = 0; i < SP.length(); i++) {
	        //     if (lastWord2 != SP.charAt(i)) {
	        //       check2 += SP.charAt(i);
	        //       lastWord2 = SP.charAt(i);
	        //     }
	        //   }
	        //   if (check1.equals(check2)) {
	        //     System.out.println("true");
	        //   } else {
	        //     System.out.println("false");
	        //   }
	        // }
	        // ip.close();
		}
	}

}
