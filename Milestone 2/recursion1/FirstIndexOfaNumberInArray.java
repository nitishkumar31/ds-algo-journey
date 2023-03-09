/*First Index Of a Number in an Array - Question
  ----------------------------------------------
Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array.
Return -1 if it is not present in the array.
First index means, the index of first occurrence of x in the input array.
Do this recursively. Indexing in the array starts from 0.

Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x

Output Format :
first index or -1

Constraints :
1 <= N <= 10^3

Sample Input :
4
9 8 10 8
8

Sample Output :
1
*/

package recursion1;

import java.util.Scanner;

public class FirstIndexOfaNumberInArray {

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static int find1stIndex(int[] input, int x) {
		return find1stIndex(input, x, 0);
	}
	
	private static int find1stIndex(int input[], int x, int si) {
		if(si == input.length)
			return -1;

		if(input[si] == x)
			return si;
		int smallAns = find1stIndex(input, x, si + 1);
		return  smallAns;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr = takeInput();
		int x = s.nextInt();
		System.out.println(find1stIndex(arr, x));
		
	}
}
