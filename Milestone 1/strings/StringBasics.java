package strings;

import java.util.Scanner;

public class StringBasics {

	public static void main(String[] args) {
		String str1 = "Coding";
		String str2 = " is fun";
		System.out.println(str1);	// Coding
		System.out.println(str1.charAt(0));	// C
		System.out.println(str1.charAt(5));	// g
		
		System.out.println(str1.contains("ing"));	// true
		
		String str3 = "Coding";
		System.out.println(str1.equals(str3));	// true
		String str4 = "Coting";
		System.out.println(str1.equals(str4));	// false
		System.out.println(str1.compareTo(str4));	// -16
		
//		str1 += str2;
		str1 = str1.concat(str2);	// working same as prev line
		System.out.println(str1);	// Coding is fun
		
		String substr1 = str3.substring(3);
		System.out.println(substr1);	// ing
		String substr2 = str3.substring(1, 5);
		System.out.println(substr2);	// odin

		String a="coding";
		for(int i=2;i<4;i++){
		    System.out.print(a.substring(i));	// dinging
		}
		
		System.out.println();
		
		for(int i=2;i<5;i++){
		    System.out.print(a.substring(i-2,i+1));	// cododidin
		}
		
		System.out.println();
		Scanner s = new Scanner(System.in);
		// input: abc de fgh
		String str;
		str = s.next();		
		System.out.println(str+" "+str.length());	// abc
		String str5 = s.nextLine();
		System.out.println(str5+" "+str5.length());	// _de_fgh
		
	}

}
