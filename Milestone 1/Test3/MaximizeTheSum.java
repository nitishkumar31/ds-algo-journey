/*Maximise the sum
  ----------------
Given 2 sorted arrays (in increasing order), find a path through the intersections that produces maximum sum and return the maximum sum.
That is, we can switch from one array to another array only at common elements.
If no intersection element is present, we need to take sum of all elements from the array with greater sum.

Input Format :
 Line 1 : An integer M i.e. size of first array
 Line 2 : M integers which are elements of first array, separated by spaces
 Line 3 : An integer N i.e. size of second array
 Line 4 : N integers which are elements of second array, separated by spaces

Output Format :
 Maximum sum value

Constraints :
1 <= M, N <= 10^6

Sample Input :
6
1 5 10 15 20 25
5
2 4 5 9 15

Sample Output :
81

Explanation :
We start from array 2 and take sum till 5 (sum = 11). Then we'll switch to array at element 10 and take till 15.
So sum = 36. Now, no elements left in array after 15, so we'll continue in array 1. Hence sum is 81.
 */

package Test3;

import java.util.Scanner;

public class MaximizeTheSum {

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static long maximumSumPath(int[] arr1, int[] arr2) {
		long maxSum = 0, sum1 = 0, sum2 = 0;
		if(arr1.length == 0 && arr2.length == 0)
			return maxSum;		// in case both arrays are empty
		
		int i=0, j=0;
		while(i < arr1.length && j < arr2.length) {
			if(arr1[i] < arr2[j]) {
				sum1 += arr1[i];
				i++;
			}
			else if(arr2[j] < arr1[i]) {
				sum2 += arr2[j];
				j++;
			}
			else {		// intersection point (input[i] == input2[j])
				sum1 += arr1[i];
				sum2 += arr2[j];
				maxSum += Math.max(sum1, sum2);
				sum1 = 0;		// re-initialize both sums and start again
				sum2 = 0;
				i++;
				j++;
			}
		}
		while(i < arr1.length) {		// in case there are still elements in 1st array
			sum1 += arr1[i];
			i++;
		}
		while(j < arr2.length) {		// in case there are still elements in 2nd array
			sum2 += arr2[j];
			j++;
		}
		maxSum += Math.max(sum1, sum2);
		return maxSum;
	}

	public static void main(String[] args) {
		int[] arr1 = takeInput();
		int[] arr2 = takeInput();
		System.out.println(maximumSumPath(arr1, arr2));
	}

}
