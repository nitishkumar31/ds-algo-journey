package arrays2D;

public class Store2dArrays {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		System.out.println(arr.length);
		int[][] arr2d = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		System.out.println(arr2d);		// reference of 2dArray
		System.out.println(arr2d[0]);	// reference of 1st 1dArray
		System.out.println(arr2d[1]);	// reference of 2nd 1dArray
		System.out.println();
		System.out.println(arr2d.length);		// gives no. of rows
		System.out.println(arr2d[0].length);	// gives no. of columns
	}

}
