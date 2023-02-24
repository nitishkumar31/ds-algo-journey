/*Triplet sum
  -----------
You have been given a random integer array/list(ARR) and a number X. Find and return the triplet(s) in the array/list which sum to X.

Note :
Given array/list can contain duplicate elements.

Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the first array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.

Third line contains an integer 'X'.

Output format :
For each test case, print the total number of triplets present in the array/list.

Output for every test case will be printed in a separate line.

Constraints :
1 <= t <= 10^2
0 <= N <= 10^3
0 <= X <= 10^9
Time Limit: 1 sec

Sample Input 1:
1
7
1 2 3 4 5 6 7 
12

Sample Output 1:
5

Sample Input 2:
2
7
1 2 3 4 5 6 7 
19
9
2 -5 8 -6 0 5 10 11 -3
10

Sample Output 2:
0
5

 Explanation for Input 2:
Since there doesn't exist any triplet with sum equal to 19 for the first query, we print 0.
For the second query, we have 5 triplets in total that sum up to 10. They are, (2, 8, 0), (2, 11, -3), (-5, 5, 10), (8, 5, -3) and (-6, 5, 11)
*/

package timeComplexity;

import java.util.*;

public class TripletSum {
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		return arr;	
	}
	
	public static int tripletSum(int[] arr, int num) {
		Arrays.sort(arr);
		if(arr.length < 3) 
		return 0;
		
		int triplets = 0;
		for(int i=0; i < arr.length-2; i++) {
			int start = i+1;
			int end = arr.length-1;
			while(start < end) {
				if((arr[start] + arr[end]) < (num - arr[i]))
					start++;
				else if(arr[start] + arr[end] > (num - arr[i]))
					end--;
				else {
					if(arr[start] == arr[end]) {
						int totalElements = end - start;
						triplets += (totalElements * (totalElements - 1) / 2);
					}
					int tempStart = start + 1;
					int tempEnd = end - 1;
					while(arr[tempStart] == arr[start] && tempStart <= tempEnd)
						tempStart++;
					while(arr[tempEnd] == arr[end] && tempEnd >= tempStart)
						tempEnd--;
					int totalStart = tempStart - start;
					int totalEnd = end - tempEnd;
					triplets += totalStart * totalEnd;
					start = tempStart;
					end = tempEnd;
				}
			}
		}
		return triplets;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t =s.nextInt();
		while(t>0) {
			int[] arr = takeInput();
			int num = s.nextInt();
			System.out.println(tripletSum(arr, num));
			t--;
		}
	}

}
