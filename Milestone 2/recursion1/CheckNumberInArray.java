/*Check Number in Array
  ---------------------
Given an array of length N and an integer x, you need to find if x is present in the array or not. Return true or false.
Do this recursively.

Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x

Output Format :
'true' or 'false'

Constraints :
1 <= N <= 10^3

Sample Input 1 :
3
9 8 10
8

Sample Output 1 :
true

Sample Input 2 :
3
9 8 10
2

Sample Output 2 :
false
*/

package recursion1;

import java.util.Scanner;

public class CheckNumberInArray {
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static boolean checkNumber(int[] input, int x) {
		if(input.length == 0)
			return false;
		
		if(input[0] == x)
			return true;
		
		int[] smallArray = new int[input.length-1];
		for(int i=1; i < input.length; i++) {
			smallArray[i-1] = input[i];
		}
		return checkNumber(smallArray, x);
	}
	
	// Better approach
	public static boolean checkNumberBetter(int arr[], int x) {
		return checkNumber(arr, x, 0);
	}
	
	private static boolean checkNumber(int arr[], int x, int si) {
		if(si == arr.length)
			return false;
		
		if(arr[si] == x)
			return true;
		return checkNumber(arr, x, si + 1);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr = takeInput();
		int x = s.nextInt();
		System.out.println(checkNumberBetter(arr, x));
	}

}
