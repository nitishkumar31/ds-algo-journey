/*Sort 0 1
  --------
You have been given an integer array/list(ARR) of size N that contains only integers, 0 and 1. Write a function to sort this array/list. Think of a solution which scans the array/list only once and don't require use of an extra array/list.

Note:
You need to change in the given array/list itself. Hence, no need to return or print anything. 

Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the array/list.

Second line contains 'N' single space separated integers(all 0s and 1s) representing the elements in the array/list.

Output format :
For each test case, print the sorted array/list elements in a row separated by a single space.

Output for every test case will be printed in a separate line.

Constraints :
1 <= t <= 10^2
0 <= N <= 10^5
Time Limit: 1 sec

Sample Input 1:
1
7
0 1 1 0 1 0 1

Sample Output 1:
0 0 0 1 1 1 1

Sample Input 2:
2
8
1 0 1 1 0 1 0 1
5
0 1 0 1 0

Sample Output 2:
0 0 0 1 1 1 1 1
0 0 0 1 1 
*/

package arrays;

//import java.util.Arrays;
import java.util.Scanner;

public class Sort01 {

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		return arr;	
	}

	public static void sort01(int[] arr) {
		int nextZero = 0;								
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				int temp = arr[nextZero];
				arr[nextZero] = arr[i];
				arr[i] = temp;
				nextZero ++;
			}
		}
		
		
//		int type0 = 0;									// 2nd approach
//		int type1 = arr.length-1;
//		while (type0 < type1) {
//			if (arr[type0] == 1) {
//				if (arr[type1] != 1) {
//					int temp = arr[type1];
//					arr[type1] = arr[type0];
//					arr[type0] = temp;
//				}
//				else {
//					type1--;
//				}
//			}
//			else {
//				type0++;
//			}
//		}
		
		

//		int one=0;										// 3rd approach with
//        int zero=0;									// worse time complexity
//        for(int i=0;i<arr.length;i++)
//        {
//            if(arr[i]==0)
//            {
//                zero++;
//            }
//            else{
//                one++;
//            }
//        }
//        for(int i=0;i<zero;i++)
//        {
//            arr[i]=0;
//        }
//        for(int i=zero;i<arr.length;i++)
//        {
//            arr[i]=1;
//        }
		
		
//		Arrays.sort(arr);							  // 4th & advance approach
		
		
	}
	

	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int t = s.nextInt();
		while(t>0) {
			int[] arr = takeInput();
			sort01(arr);
			printArray(arr);
			t--;
		}
	}

}
