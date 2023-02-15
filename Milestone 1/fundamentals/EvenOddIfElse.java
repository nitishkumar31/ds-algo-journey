package fundamentals;

import java.util.Scanner;

public class EvenOddIfElse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		if(n%2==0) {
			System.out.println(n+" is even");
		}
		else {
			System.out.println(n+" is odd");
		}

	}

}
