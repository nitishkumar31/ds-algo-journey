package recursion1;

import java.util.Scanner;

public class FibonacciNumber {
	
	public static int fib(int n) {
		if(n == 1 || n == 2) {
			return 1;
		}
		
		int output = fib(n-1) + fib(n-2);
		return output;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(fib(n));
	}

}
