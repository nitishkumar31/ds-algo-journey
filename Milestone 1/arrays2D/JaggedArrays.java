/* Jagged Arrays:
 * In which 2d array no. of columns are not same for each of the row.
 * You can have different columns for each row.
 */

package arrays2D;

public class JaggedArrays {

	public static void main(String[] args) {
		int[][] arr = new int[4][];
		for(int i=0; i < arr.length; i++) {
			arr[i] = new int[i+2];
		}
		
		// printing the 2d array
		for(int i=0; i < arr.length; i++) {
			for(int j=0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
