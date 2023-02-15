package functions;

import java.util.Scanner;
public class DivideNumbers {
	public static void divisionResult(int num, int deno) {
		if(deno==0) {
			System.out.println("Division by zero is not allowed");
			return;
		}
		System.out.println(num/deno);
	}
	
//	public static int divideNumbers(int num, int deno){					//using int data type
//		if(deno == 0)
//			return Integer.MIN_VALUE;
//		return num/deno;
//	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int deno = s.nextInt();
		
		divisionResult(num, deno);
		
//		int result = divideNumbers(num, deno);
//		System.out.println(result);
	}

}
