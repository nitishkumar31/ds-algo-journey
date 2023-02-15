package fundamentals;

import java.util.Scanner;

public class ConditionalAndRelational {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1,num2;
		num1 = input.nextInt();
		num2 = input.nextInt();
		
//		if(num1 > 0 && num2 > 0) {
//			System.out.println("Both are positive");
//		}
//		else {
//			System.out.println("Both are not positive");
//		}
		
//		if(num1>0 || num2>0) {
//			System.out.println("One is positive");
//		}
//		else {
//			System.out.println("None is positive");
//		}
		
		if(num1==num2) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}

	}

}
