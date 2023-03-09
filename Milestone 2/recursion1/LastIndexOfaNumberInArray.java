/*Last Index Of a Number in an Array - Question
  ---------------------------------------------
Given an array of length N and an integer x, you need to find and return the last index of integer x present in the array.
Return -1 if it is not present in the array.
Last index means - if x is present multiple times in the array, return the index at which x comes last in the array.
You should start traversing your array from 0, not from (N - 1).
Do this recursively. Indexing in the array starts from 0.

Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x

Output Format :
last index or -1

Constraints :
1 <= N <= 10^3

Sample Input :
4
9 8 10 8
8

Sample Output :
3
 */

package recursion1;

import java.util.Scanner;

public class LastIndexOfaNumberInArray {

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static int findLastIndex(int[] input, int x) {
		return findLastIndex(input, x, 0);
	}

	private static int findLastIndex(int input[], int x, int si) {
		if(si == input.length)
			return -1;

//		System.out.println(si);
		int smallAns = findLastIndex(input, x, si + 1);
//		System.out.println(smallAns+" "+si);
		if(smallAns != -1) {
//			System.out.println(smallAns+" if block "+si);
			return smallAns;
		} else {
//			System.out.println(smallAns+" else block "+si);
			if(input[si] == x) {
				return si;
			}
			else {
				return -1;
			}
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr = takeInput();
		int x = s.nextInt();
		System.out.println(findLastIndex(arr, x));
	}

}
