/*Code Insertion Sort
  -------------------
Provided with a random integer array/list(ARR) of size N, you have been required to sort this array using 'Insertion Sort'.

Note:
Change in the input array/list itself. You don't need to return or print the elements.

Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.

Output Format :
For each test case, print the elements of the array/list in sorted order separated by a single space.

Output for every test case will be printed in a separate line.

Sample Input 1:
1
7
2 13 4 1 3 6 28

Sample Output 1:
1 2 3 4 6 13 28

Sample Input 2:
2
5
9 3 6 2 0
4
4 3 2 1

Sample Output 2:
0 2 3 6 9
1 2 3 4 
*/

package arrays;

import java.util.Scanner;

public class InsertionSort {
	
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
	
	public static void insertionSort(int[] arr) {
		for(int i=1; i < arr.length; i++) {
			int current = arr[i];
			int j = i-1;
			while(j>=0 && arr[j] > current) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = current;
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t>0) {
			int[] arr = takeInput();
			insertionSort(arr);
			printArray(arr);
			t--;
		}
	}

}
