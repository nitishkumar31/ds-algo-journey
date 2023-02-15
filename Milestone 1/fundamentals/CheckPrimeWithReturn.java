package fundamentals;

import java.util.Scanner;
public class CheckPrimeWithReturn {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		int div = 2;
		while(div <= n/2) {
			if(n % div == 0) {
				System.out.println("Composite");
				return;
			}
			div = div + 1;
		}
		System.out.println("Prime");

	}

}
