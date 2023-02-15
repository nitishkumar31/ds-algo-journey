/*Reverse Each Word
  -----------------
Aadil has been provided with a sentence in the form of a string as a function parameter. The task is to implement a function so as to print the sentence such that each word in the sentence is reversed.

Example:
Input Sentence: "Hello, I am Aadil!"
The expected output will print, ",olleH I ma !lidaA".

Sample Input 1:
Welcome to Coding Ninjas

Sample Output 1:
emocleW ot gnidoC sajniN

Sample Input 2:
Always indent your code

Sample Output 2:
syawlA tnedni ruoy edoc
*/

package strings;

import java.util.Scanner;

public class ReverseEachWord {


	public static String reverseEachWord(String str) {
		String ans = "";
		int curStart = 0;
		int i, j;
		for(i=0; i<str.length(); i++) {
			if(str.charAt(i) == ' ') {
				// Reverse current word
				int curEnd = i-1;
				String reversedWord = "";
				for(j = curEnd; j>=curStart; j--) {
					reversedWord += str.charAt(j);
				}
				// Add it to final string
				ans += reversedWord +" ";
				curStart = i+1;
			}
		}
		int curEnd = i-1;
		String reversedWord = "";
		for(j = curEnd; j>=curStart; j--) {
			reversedWord += str.charAt(j);
		}
		ans += reversedWord;
		return ans;
	}
	
	//-------------2nd approach by creating reverse function-----------------
	private static String reverseWord(String str, int end, int start) {
		String reversedWord = "";
		for(int j = end; j>=start; j--) {
			reversedWord += str.charAt(j);
		}
		return reversedWord;
	}

	public static String reverseEachWord2(String str) {
		String ans = "";
		int curStart = 0;
		int i, j;
		for(i=0; i<str.length(); i++) {
			if(str.charAt(i) == ' ') {
				int curEnd = i-1;
				ans += (reverseWord(str, curEnd, curStart) +" ");
				curStart = i+1;
			}
		}
		int curEnd = i-1;
		ans += reverseWord(str, curEnd, curStart);
		return ans;
	}
	//-----------------------------------------------------------------------
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(reverseEachWord(str));
//		System.out.println(reverseEachWord2(str));

	}

}
