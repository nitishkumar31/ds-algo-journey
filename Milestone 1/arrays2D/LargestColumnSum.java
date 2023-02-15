package arrays2D;

import java.util.Scanner;

public class LargestColumnSum {
	
	public static int[][] take2DInput(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rows = s.nextInt();
		System.out.println("Enter the number of columns: ");
		int cols = s.nextInt();
		int[][] arr = new int[rows][cols];
		for( int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				System.out.println("Enter the element at " + i + "th row & " + j + "th column");
				arr[i][j] = s.nextInt();
			}
		}
		return arr;
	}
	
	public static int largestColSum(int[][] arr) {
		int rows = arr.length;
		int cols = arr[0].length;
		int largest = Integer.MIN_VALUE;
		for(int j=0; j<cols; j++) {
			int colSum = 0;
			for(int i=0; i<rows; i++) {
				colSum += arr[i][j];
			}
			if(colSum > largest) {
				largest = colSum;
			}
		}
		return largest;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t>0) {
			int[][] arr = take2DInput();
			System.out.println(largestColSum(arr));
			t--;
		}
		

	}

}
