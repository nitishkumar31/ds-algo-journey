/*Sum Of Array
  ------------
Given an array of length N, you need to find and return the sum of all elements of the array.
Do this recursively.

Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces

Output Format :
Sum

Constraints :
1 <= N <= 10^3

Sample Input 1 :
3
9 8 9

Sample Output 1 :
26

Sample Input 2 :
3
4 2 1

Sample Output 2 :
7
*/

package recursion1;

import java.util.Scanner;

public class SumOfArray {
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	// 1st Approach
	public static int sum(int[] arr) {
		if(arr.length == 1) 
			return arr[0];
		
		int[] smallArray = new int[arr.length-1];
		for(int i=1; i<arr.length; i++) {
			smallArray[i-1] = arr[i];
		}
		return arr[0] + sum(smallArray);
	}
	
	// Better approach
	public static int sumBetter(int[] arr) {
		return sum(arr, 0);
	}
	
	private static int sum(int arr[], int si) {
		if(si == arr.length)
			return 0;
		
		return arr[si] + sum(arr, si + 1);
	}
	

	public static void main(String[] args) {
		int arr[] = takeInput();
		System.out.println(sumBetter(arr));
	}

}
