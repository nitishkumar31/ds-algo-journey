package fundamentals;

import java.util.Scanner;

public class LargestOfTwo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();

//		if(a>b) {
//			System.out.println("1st num is greater");
//		}
//		else {
//			if(b>a) {
//				System.out.println("2nd num is greater");
//			}
//			else {
//				System.out.println("Both are Equal");
//			}
//		}

		if(a>b) {
			System.out.println("1st num is greater");
		}
		else if(b>a) {
			System.out.println("2nd num  is greater");
		}
		else {
			System.out.println("Both are equal");
		}
	}

}
