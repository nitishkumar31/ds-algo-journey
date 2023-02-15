package fundamentals;

import java.util.Scanner;

public class ScannerInput {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String str = s.next();
//		String str = s.nextLine();
//		System.out.println(str);
		
		char ch = str.charAt(0);
		System.out.println(ch);
		
		
	/*	int a = s.nextInt();
		String str = s.next();
		System.out.print(a);
		System.out.println(str); */
	}

}
