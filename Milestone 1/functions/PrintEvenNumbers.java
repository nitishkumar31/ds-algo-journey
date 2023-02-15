package functions;

import java.util.Scanner;
public class PrintEvenNumbers {
	public static void EvenNumbers(int start, int end) {
		if(start%2 != 0){
			start++;
		}
		for(int i=start; i<=end; i+=2) {
			System.out.print(i+" ");
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		EvenNumbers(a, b);
	}

}
