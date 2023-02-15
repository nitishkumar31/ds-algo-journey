/*Check Array Rotation
  --------------------
You have been given an integer array/list(ARR) of size N. It has been sorted(in increasing order) and then rotated by some number 'K' in the right hand direction.
Your task is to write a function that returns the value of 'K', that means, the index from which the array/list has been rotated.

Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.

Output Format :
For each test case, print the value of 'K' or the index from which which the array/list has been rotated.

Output for every test case will be printed in a separate line.

Sample Input 1:
1
6
5 6 1 2 3 4

Sample Output 1:
2

Sample Input 2:
2
5
3 6 8 9 10
4
10 20 30 1

Sample Output 2:
0
3
*/

package arrays;

import java.util.Scanner;

public class CheckArrayRotation {
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static int checkArrayRotation(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] > arr[i+1]) {
				return i+1;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t>0) {
			int[] arr = takeInput();
			int k = checkArrayRotation(arr);
			System.out.println(k);
			t--;
		}

	}

}
