/*Code Merge Two Sorted Arrays
  ----------------------------
You have been given two sorted arrays/lists(ARR1 and ARR2) of size N and M respectively, merge them into a third array/list such that the third array is also sorted.

Input Format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the first array/list.

Second line contains 'N' single space separated integers representing the elements of the first array/list.

Third line contains an integer 'M' representing the size of the second array/list.

Fourth line contains 'M' single space separated integers representing the elements of the second array/list.

Output Format :
For each test case, print the sorted array/list(of size N + M) in a single row, separated by a single space.

Output for every test case will be printed in a separate line.

Sample Input 1 :
1
5
1 3 4 7 11
4
2 4 6 13

Sample Output 1 :
1 2 3 4 4 6 7 11 13 

Sample Input 2 :
2
3
10 100 500
7
4 7 9 25 30 300 450
4
7 45 89 90
0

Sample Output 2 :
4 7 9 10 25 30 100 300 450 500
7 45 89 90
*/

package arrays;

import java.util.Scanner;

public class Merge2SortedArrays {

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static int[] mergeArrays(int arr1[], int arr2[]) {
		// Create a new array to store the result
		int N = arr1.length;
		int M = arr2.length;
		int[] result = new int[N + M];
		
		// Initialize the indexes for the two input arrays
		int i=0, j=0;
		
		// Iterate through both arrays and add the smaller element to the result array
		for(int k=0; k < result.length; k++) {
			if(i >= N) {
				// arr1 has been completely added to the result, so add the remaining elements
                // from arr2
				result[k] = arr2[j];
				j++;
			}
			else if(j >= M) {
				// arr2 has been completely added to the result, so add the remaining elements
                // from arr1
				result[k] = arr1[i];
				i++;
			}
			else if(arr1[i] <= arr2[j]) {
				// arr1 has a smaller element, so add it to the result
				result[k] = arr1[i];
				i++;
			}
			else {	// (arr2[j] <= arr1[i])
				// arr2 has a smaller element, so add it to the result
				result[k] = arr2[j];
				j++;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t>0) {
			int[] arr1 = takeInput();
			int[] arr2 = takeInput();
			int[] result = mergeArrays(arr1, arr2);
			printArray(result);
			t--;
		}
	}

}
