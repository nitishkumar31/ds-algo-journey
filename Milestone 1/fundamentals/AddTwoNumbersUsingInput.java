package fundamentals;

import java.util.Scanner;

public class AddTwoNumbersUsingInput {

	public static void main(String[] args) {
		
		int a, b;
		
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		int c = a + b;
		System.out.println(c);

//			We can use same input syntax double, long etc.(except char) as below:
//				s.nextDouble();
//				s.nextLong();
//			and so on...
	}

}
