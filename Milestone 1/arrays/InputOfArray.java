package arrays;

import java.util.Scanner;

public class InputOfArray {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the range of array:");
		int n = s.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter element at "+i+"th index");
			arr[i] = s.nextInt();
		}
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
	}

}
