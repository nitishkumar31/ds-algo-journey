/*Code Binary Search
  ------------------
You have been given a sorted(in ascending order) integer array/list(ARR) of size N and an element X. Write a function to search this element in the given input array/list using 'Binary Search'. Return the index of the element in the input array/list. If the element is not present in the array/list, then return -1.

Input format :
The first line contains an Integer 'N', which denotes the size of the array/list.

The second line contains 'N' single space-separated integers representing the elements in the array/list.

The third line contains the value of X to be searched for in the array/list.

Output Format :
Print the index at which X is present for each test case, -1 otherwise.

Sample Input 1:
7
1 3 7 9 11 12 45
3

Sample Output 1:
1

Sample Input 2:
7
1 2 3 4 5 6 7
9

Sample Output 2:
-1
*/

package arrays;

import java.util.Scanner;

public class BinarySearch {
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		return arr;	
	}
	
	public static int binarySearch(int[] arr, int x) {
		int start = 0, end = arr.length-1;
		int mid = 0;
		while(start <= end) {
			mid = (start + end) / 2;
			if(arr[mid] > x) {
				end = mid - 1;
			}
			else if(arr[mid] < x) {
				start = mid + 1;
			}
			else {		    //arr[m] == x
				return mid;
			}
		}
		return -1;
	}
	
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr = takeInput();
		int x = s.nextInt();
		System.out.println(binarySearch(arr, x));
	}

}
