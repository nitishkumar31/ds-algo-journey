package functions;
import java.util.Scanner;

public class CheckPrime {
	public static boolean checkPrime(int n) {
		int div = 2;
		while(div <= n/2) {
			if(n%div==0) {
				return false;
			}
			div+=1;
		}
		return true;
	}

	public static boolean checkPrime2(int n) {					//another approach using break statement
		int div = 2;
		boolean isPrime = true;
		while(div<=n/2) {
			if(n%div==0) {
				isPrime = false;
				break;
			}
			div+=1;
		}
		return isPrime;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		//		boolean isPrime = checkPrime(n);
		boolean isPrime = checkPrime2(n);
		System.out.println(isPrime);

	}

}
