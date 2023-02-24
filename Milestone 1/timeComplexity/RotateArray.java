/*Rotate array
  ------------
You have been given a random integer array/list(ARR) of size N. Write a function that rotates the given array/list by D elements(towards the left).

Note:
Change in the input array/list itself. You don't need to return or print the elements.

Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.

Third line contains the value of 'D' by which the array/list needs to be rotated.

Output Format :
For each test case, print the rotated array/list in a row separated by a single space.

Output for every test case will be printed in a separate line.

Constraints :
1 <= t <= 10^4
0 <= N <= 10^6
0 <= D <= N
Time Limit: 1 sec

Sample Input 1:
1
7
1 2 3 4 5 6 7
2

Sample Output 1:
3 4 5 6 7 1 2

Sample Input 2:
2
7
1 2 3 4 5 6 7
0
4
1 2 3 4
2

Sample Output 2:
1 2 3 4 5 6 7
3 4 1 2
*/

package timeComplexity;

import java.util.Scanner;

public class RotateArray {
	
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

	public static void rotateArray(int[] arr, int d) {
		if(arr.length == 0)
			return;
		
		if(d >= arr.length && arr.length != 0) {
			d %= arr.length;
		}
		
		int n = arr.length - 1;
		reverse(arr, 0, n);
		reverse(arr, 0, n-d);
		reverse(arr, n-d+1, n);
	}
	
	private static void reverse(int[] arr, int start, int end) {
		while(start < end) {
			swapElements(arr, start, end);
			start++;
			end--;
		}
	}
	
	private static void swapElements(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t>0){
			int[] arr = takeInput();
			int d = s.nextInt();
			rotateArray(arr, d);
			printArray(arr);
			t--;
		}

	}

}
