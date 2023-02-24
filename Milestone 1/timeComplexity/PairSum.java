/*Pair sum in array
  -----------------
You have been given an integer array/list(ARR) and a number 'num'. Find and return the total number of pairs in the array/list which sum to 'num'.

Note:
Given array/list can contain duplicate elements. 

Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the first array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.

Third line contains an integer 'num'.

Output format :
For each test case, print the total number of pairs present in the array/list.

Output for every test case will be printed in a separate line.

Constraints :
1 <= t <= 10^2
0 <= N <= 10^4
0 <= num <= 10^9
Time Limit: 1 sec

Sample Input 1:
1
9
1 3 6 2 5 4 3 2 4
7

Sample Output 1:
7

Sample Input 2:
2
9
1 3 6 2 5 4 3 2 4
12
6
2 8 10 5 -2 5
10

Sample Output 2:
0
2

Explanation for Input 2:
Since there doesn't exist any pair with sum equal to 12 for the first query, we print 0.
For the second query, we have 2 pairs in total that sum up to 10. They are, (2, 8) and (5, 5).
*/

package timeComplexity;

import java.util.*;

public class PairSum {
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		return arr;	
	}
	
	public static int pairSum(int[] arr, int num) {
		Arrays.sort(arr);
		
		int start = 0;
		int end = arr.length -1;
		int numPair = 0;
		while(start < end) {
			if(arr[start] + arr[end] < num) {
				start++;
			}
			else if(arr[start] + arr[end] > num) {
				end--;
			} else {
				if(arr[start] == arr[end]) {
					int totalElements = (end - start) + 1;
					numPair += (totalElements * (totalElements - 1) / 2); 
					return numPair;
				}
				int tempStart = start + 1;
				int tempEnd = end - 1;
				
				while(arr[tempStart] == arr[start] && tempStart <= tempEnd) {
					tempStart++;
				}
				while(arr[tempEnd] == arr[end] && tempEnd >= tempStart) {
					tempEnd--;
				}
				
				int totalStart = tempStart - start;
				int totalEnd = end - tempEnd;
				
				numPair += totalStart * totalEnd;
				
				start = tempStart;
				end = tempEnd;
			}
		}
		
		return numPair;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t>0) {
			int[] arr = takeInput();
			int num = s.nextInt();
			System.out.println(pairSum(arr, num));
			t--;
		}
	}

}
