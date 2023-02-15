/*Largest Row or Column
  ---------------------
For a given two-dimensional integer array/list of size (N x M), you need to find out which row or column has the largest sum(sum of all the elements in a row/column) amongst all the rows and columns.

Note :
If there are more than one rows/columns with maximum sum, consider the row/column that comes first. And if ith row and jth column has the same largest sum, consider the ith row as answer.

Input Format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains two integer values, 'N' and 'M', separated by a single space. They represent the 'rows' and 'columns' respectively, for the two-dimensional array/list.

Second line onwards, the next 'N' lines or rows represent the ith row values.

Each of the ith row constitutes 'M' column values separated by a single space.

Output Format :
For each test case, If row sum is maximum, then print: "row" <row_index> <row_sum>
OR
If column sum is maximum, then print: "column" <col_index> <col_sum>
It will be printed in a single line separated by a single space between each piece of information.

Output for every test case will be printed in a seperate line.

Consider :
If there doesn't exist a sum at all then print "row 0 -2147483648", where -2147483648 or -2^31 is the smallest value for the range of Integer.

Sample input 1:
1
2 2
4 4
4 4

Sample Output 1:
row 0 8

Sample input 2:
1
4 4
6 9 8 5 
9 2 4 1 
8 3 9 3 
8 7 8 6 

Sample Output 2:
column 0 31
*/

package arrays2D;

import java.util.Scanner;

public class LargestRowOrColumn {
	
	public static int[][] take2DInput(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rows = s.nextInt();
		System.out.println("Enter the number of columns: ");
		int cols = s.nextInt();
		int[][] arr = new int[rows][cols];
		for( int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		return arr;
	}
	
	public static void findLargest(int[][] mat) {
		boolean isRow = true;
		int largestSum = Integer.MIN_VALUE;
		int idx = 0;
		
		int nRows = mat.length;
		if(nRows == 0) {
			System.out.println("row " + idx + " " + largestSum);
			return;
		}
		int mCols = mat[0].length;
		
		// finding max row sum
		for(int i=0; i < nRows; i++) {
			int rowSum = 0;
			for(int j=0; j < mCols; j++) {
				rowSum += mat[i][j];
			}
			if(rowSum > largestSum) {
				largestSum = rowSum;
				idx = i;
			}
		}
		
		// finding max column sum
		for(int j=0; j < mCols; j++) {
			int colSum = 0;
			for(int i=0; i < nRows; i++) {
				colSum += mat[i][j];
			}
			if(colSum > largestSum) {
				largestSum = colSum;
				idx = j;
				isRow = false;
			}
		}
		if(isRow) {
			System.out.println("row " + idx + " " + largestSum);
		} else {
			System.out.println("column " + idx + " " + largestSum);
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t>0) {
			int[][] mat = take2DInput();
			findLargest(mat);
			t--;
		}

	}

}
