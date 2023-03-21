/*Quick Sort - Problem Statement
  ------------------------------
Sort an array A using Quick Sort.

Change in the input array itself. So no need to return or print anything.

Input format :
Line 1 : Integer n i.e. Array size
Line 2 : Array elements (separated by space)

Output format :
Array elements in increasing order (separated by space)

Constraints :
1 <= n <= 10^3

Sample Input 1 :
6 
2 6 8 5 4 3

Sample Output 1 :
2 3 4 5 6 8

Sample Input 2 :
5
1 5 2 7 3

Sample Output 2 :
1 2 3 5 7 

Hint :
	To apply the method explained in the hint video, we have to add two more parameters in the function call.
	This can be done by calling a helper function from given function. The helper function can have three parameters: array, start index, end index.  

	Skeleton code to achieve this:
	public class Solution {
		public static void quickSort(int[] input, int startIndex, int endInedx) {
			// your code goes here
		}

		public static void quickSort(int[] input) {
			quickSort(input, 0, input.length - 1);
		}

	}

 */

package recursion2;

import java.util.Scanner;

public class QuickSort {

	public static int[] takeInput(){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] input = new int[n];
		for(int i = 0; i < n; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	

	public static void quickSort(int input[]) {
		quickSort(input, 0, input.length-1);
	}

	private static void quickSort(int[] input, int si, int ei) {
		// Base case
		if(si >= ei)
			return;

		int pivotIndex = partition(input, si, ei);
		quickSort(input, si, pivotIndex - 1);
		quickSort(input, pivotIndex + 1, ei);
	}

	private static int partition(int[] input, int si, int ei) {
		int pivot = input[si];
		int count = 0;
		for(int i = si+1; i <= ei; i++) {
			if(input[i] < pivot)
				count++;
		}
		int temp = input[si + count] ;
		input[si + count] = pivot;	// we can write "input[si]" instead of "pivot"
		input[si] = temp;

		int i = si, j = ei;
		while(i < j) {
			if(input[i] < pivot) {
				i++;
			} else if(input[j] >= pivot){
				j--;
			} else {	// (input[i] > pivot && input[j] < pivot)
				temp = input[i];
				input[i] = input[j];
				input[j] = temp;
				i++;
				j--;
			}
		}
		return si + count;
	}
	

	public static void main(String[] args) {
		int[] input = takeInput();
		quickSort(input);
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}

}
