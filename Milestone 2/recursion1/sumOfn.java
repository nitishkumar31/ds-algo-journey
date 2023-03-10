package recursion1;

import java.util.Scanner;

public class sumOfn {
	
	public static int sum(int n) {
		if(n == 0)
			return 0;
		
		int smallOutput = sum(n-1);
		int output = n + smallOutput;
//		int output = n + sum(n-1);			//initialization and declaration in one line
		return output;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(sum(n));

	}

}
