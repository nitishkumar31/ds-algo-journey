package strings;

import java.util.Scanner;

public class ReverseString {
	
	public static String reverseString(String str) {
		String reversedStr = "";
		for(int i = str.length()-1; i>=0; i--){
			reversedStr+=str.charAt(i);
		}
		
		// 2nd approach printing elements from starting of the String
//		int n = str.length();
//		for(int i=0; i<n; i++) {
//			reversedStr = str.charAt(i) + reversedStr;
//			
//			// reversedStr += str.charAt(n-1-i);		// Another approach but printing from last
//		
//		}
		return reversedStr;
	}

	public static void main(String[] args) {
		Scanner  s = new Scanner (System.in);
		String str = s.nextLine();
		System.out.println(reverseString(str));
	}

}
