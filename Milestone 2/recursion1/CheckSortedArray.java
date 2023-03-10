package recursion1;

import java.util.Scanner;

public class CheckSortedArray {
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static boolean isSorted(int[] arr) {
		if(arr.length == 1) 
			return true;
		
		if(arr[0] > arr [1])
			return false;
		
		int smallArray[] = new int[arr.length-1];
		for(int i=1; i< arr.length; i++) {
			smallArray[i-1] = arr[i];
		}
		boolean isSmallArraySorted = isSorted(smallArray);
		return isSmallArraySorted;
//		return isSorted(smallArray);
	}

	// Better approach
	public static boolean isSortedBetter(int arr[]) {
		return isSortedBetter(arr, 0);
	}
	
	private static boolean isSortedBetter(int[] arr, int si) {	// si = start index
		if(si == arr.length-1)
			return true;
		
		if(arr[si] > arr[si + 1])
			return false;
		boolean isSmallArraySorted = isSortedBetter(arr, si + 1);
		return isSmallArraySorted;
	}
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		System.out.println(isSortedBetter(arr));
	}

}
