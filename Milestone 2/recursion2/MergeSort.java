/*Merge Sort - Problem Statement
  ------------------------------
Sort an array A using Merge Sort.
Change in the input array itself. So no need to return or print anything.

Input format :
Line 1 : Integer n i.e. Array size
Line 2 : Array elements (separated by space)

Output format :
Array elements in increasing order (separated by space)

Constraints :
1 <= n <= 10^3

Sample Input 1 :
6 
2 6 8 5 4 3

Sample Output 1 :
2 3 4 5 6 8

Sample Input 2 :
5
2 1 5 2 3

Sample Output 2 :
1 2 2 3 5 
*/

package recursion2;

import java.util.Scanner;

public class MergeSort {

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void printArray(int input[]) {
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}

	public static void mergeSort(int[] input) {
		if(input.length <= 1)
			return;

		int mid = input.length / 2;
		int part1[] = new int[mid];
		int part2[] = new int[input.length - part1.length];
		for(int i=0; i < part1.length; i++) {
			part1[i] = input[i];
		}
		for(int i=mid; i < input.length; i++) {
			part2[i - mid] = input[i];
		}
		mergeSort(part1);
		mergeSort(part2);
		merge(input, part1, part2);
	}

	private static void merge(int[] input, int[] part1, int[] part2) {
		int i=0, j=0, k=0;
		while(i < part1.length && j < part2.length) {
			if(part1[i] <= part2[j]) {
				input[k] = part1[i];
				k++;
				i++;
			} else {
				input[k] = part2[j];
				k++;
				j++;
			}
		}
		while(i < part1.length) {
			input[k] = part1[i];
			k++;
			i++;
		}
		while(j < part2.length) {
			input[k] = part2[j];
			k++;
			j++;
		}
	}

	public static void main(String[] args) {
		int[] input = takeInput();
		mergeSort(input);
		printArray(input);
	}

}
