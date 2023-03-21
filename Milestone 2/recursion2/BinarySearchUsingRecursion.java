package recursion2;

import java.util.Scanner;

public class BinarySearchUsingRecursion {
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static int binarySearch(int[] arr, int x) {
		return binarySearch(arr, 0, arr.length-1, x);
	}
	
	private static int binarySearch(int[] arr, int si, int ei, int x) {
		if(si > ei)
			return -1;
		
		int midIndex = (si + ei) / 2;
		if(arr[midIndex] > x) {
			return binarySearch(arr, si, midIndex-1, x);
		}
		else if(arr[midIndex] < x) {
			return binarySearch(arr, midIndex+1, ei, x);
		}
		else {
			return midIndex;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[] = takeInput();
		int x = s.nextInt();		
		System.out.println(binarySearch(arr, x));
	}

}
