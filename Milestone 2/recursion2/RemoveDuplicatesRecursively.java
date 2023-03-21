package recursion2;

import java.util.Scanner;

public class RemoveDuplicatesRecursively {
	
	public static String removeConsecutiveDuplicates(String s) {
		if(s.length() <= 1)
			return s;
		
		String smallOutput = removeConsecutiveDuplicates(s.substring(1));
		if(s.charAt(1) == s.charAt(0)) {		// we can write "smallOutput.charAt(0)" instead of "s.charAt(1)" 
			System.out.println("if "+s.charAt(1)+"  "+smallOutput);
			return smallOutput;
		} else {
			System.out.println("else "+s.charAt(1)+"  "+smallOutput);
			return s.charAt(0) + smallOutput;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(removeConsecutiveDuplicates(str));

	}

}
