/*Second Largest in array
  -----------------------
You have been given a random integer array/list(ARR) of size N. You are required to find and return the second largest element present in the array/list.
If N <= 1 or all the elements are same in the array/list then return -2147483648 or -2 ^ 31(It is the smallest value for the range of Integer)

Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first line of each test case or query contains an integer 'N' representing the size of the array/list.

The second line contains 'N' single space separated integers representing the elements in the array/list.

Output Format :
For each test case, print the second largest in the array/list if exists, -2147483648 otherwise.

Output for every test case will be printed in a separate line.

Sample Input 1:
1
7
2 13 4 1 3 6 28

Sample Output 1:
13

Sample Input 2:
1
5
9 3 6 2 9

Sample Output 2:
6

Sample Input 3:
2
2
6 6
4
90 8 90 5

Sample Output 3:
-2147483648
8
*/

package arrays;

import java.util.Scanner;

public class SecondLargestInArray {
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static int SecondLargestElement(int[] arr) {
		
		if(arr.length == 0) {
			return Integer.MIN_VALUE;
		}
		
		int lar = Integer.MIN_VALUE;
		int secLar = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > lar) {
				secLar = lar;
				lar = arr[i];
			}
			else if(arr[i] >secLar && arr[i] != lar) {
				secLar = arr[i];
			}
		}
		return secLar;
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t>0) {
			int[] arr = takeInput();
			int secL = SecondLargestElement(arr);
			System.out.println(secL);
			t--;
		}

	}

}
