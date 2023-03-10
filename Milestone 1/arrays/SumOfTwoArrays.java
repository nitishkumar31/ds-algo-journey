/*Sum of Two Arrays
  -----------------
Two random integer arrays/lists have been given as ARR1 and ARR2 of size N and M respectively. Both the arrays/lists contain numbers from 0 to 9(i.e. single digit integer is present at every index). The idea here is to represent each array/list as an integer in itself of digits N and M.
You need to find the sum of both the input arrays/list treating them as two integers and put the result in another array/list i.e. output array/list will also contain only single digit at every index.

Note:
The sizes N and M can be different. 

Output array/list(of all 0s) has been provided as a function argument. Its size will always be one more than the size of the bigger array/list. Place 0 at the 0th index if there is no carry. 

No need to print the elements of the output array/list.
Using the function "sumOfTwoArrays", write the solution to the problem and store the answer inside this output array/list. The main code will handle the printing of the output on its own.

Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the first array/list.

Second line contains 'N' single space separated integers representing the elements of the first array/list.

Third line contains an integer 'M' representing the size of the second array/list.

Fourth line contains 'M' single space separated integers representing the elements of the second array/list.

Output Format :
For each test case, print the required sum of the arrays/list in a row, separated by a single space.

Output for every test case will be printed in a separate line.

Sample Input 1:
1
3
6 2 4
3
7 5 6

Sample Output 1:
1 3 8 0

Sample Input 2:
2
3
8 5 2
2
1 3
4
9 7 6 1
3
4 5 9

Sample Output 2:
0 8 6 5
1 0 2 2 0 
*/

package arrays;

import java.util.Scanner;

public class SumOfTwoArrays {

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

	public static void sumOfTwoArrays(int[] arr1, int[] arr2, int[] output) {
		int i = arr1.length-1;
		int j = arr2.length-1;
		int k = Math.max(arr1.length, arr2.length); 	//k is current index of the output array
		int carry = 0;
		for (int l=k;l>=0;l--) {
			if(i>=0 && j>=0) {
				int sum = arr1[i] + arr2[j] + carry;
				output[k] = sum % 10;
				carry = sum / 10;
				i--;
				j--;
				k--;
			} else if(i>=0) {
				int sum = arr1[i] + carry;
				output[k] = sum % 10;
				carry = sum / 10;
				i--;
				k--;
			} else if(j>=0) {
				int sum = arr1[j] + carry;
				output[k] = sum % 10;
				carry = sum / 10;
				j--;
				k--;
			}
		}
		output[0] = carry;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t>0) {
			int[] arr1 = takeInput();
			int[] arr2 = takeInput();
			int[] output = new int[1 + Math.max(arr1.length, arr2.length)];

			sumOfTwoArrays(arr1, arr2, output);
			printArray(output);
			t--;
		}

	}

}
