/*Print Spiral
  ------------
For a given two-dimensional integer array/list of size (N x M), print it in a spiral form. That is, you need to print in the order followed for every iteration:

a. First row(left to right)
b. Last column(top to bottom)
c. Last row(right to left)
d. First column(bottom to top)

Mind that every element will be printed only once.

Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains two integer values, 'N' and 'M', separated by a single space. They represent the 'rows' and 'columns' respectively, for the two-dimensional array/list.

Second line onwards, the next 'N' lines or rows represent the ith row values.

Each of the ith row constitutes 'M' column values separated by a single space.

Output format :
For each test case, print the elements of the two-dimensional array/list in the spiral form in a single line, separated by a single space.

Output for every test case will be printed in a seperate line.

Sample Input 1:
1
4 4 
1 2 3 4 
5 6 7 8 
9 10 11 12 
13 14 15 16

Sample Output 1:
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 

Sample Input 2:
2
3 3 
1 2 3 
4 5 6 
7 8 9
3 1
10
20
30

Sample Output 2:
1 2 3 6 9 8 7 4 5 
10 20 30 
*/

package arrays2D;

import java.util.Scanner;

public class SpiralPrint {
	
	public static int[][] take2DInput(){
		Scanner s = new Scanner(System.in);
		int rows = s.nextInt();
		int cols = s.nextInt();
		int[][] arr = new int[rows][cols];
		for( int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		return arr;
	}
	
	public static void spiralPrint(int[][] mat) {
		if(mat.length ==0)
			return;
		int rowS = 0, rowE = mat.length-1;
		int colS = 0, colE = mat[0].length-1;
		
		int totalEle = mat.length * mat[0].length;
		int count = 0;
		
		while(count < totalEle) {
			for(int i = colS; i <= colE && count < totalEle; i++) {
				count++;
				System.out.print(mat[rowS][i] + " ");
			}
			rowS++;
			
			for(int i = rowS; i <= rowE && count < totalEle; i++) {
				count++;
				System.out.print(mat[i][colE] + " ");
			}
			colE--;
			
			for(int i = colE; i >= colS && count < totalEle; i--) {
				count++;
				System.out.print(mat[rowE][i] + " ");
			}
			rowE--;
			
			for(int i = rowE; i >= rowS && count < totalEle; i--) {
				count++;
				System.out.print(mat[i][colS] + " ");
			}
			colS++;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t>0) {
			int[][] mat = take2DInput();
			spiralPrint(mat);
			t--;
		}
	}

}
