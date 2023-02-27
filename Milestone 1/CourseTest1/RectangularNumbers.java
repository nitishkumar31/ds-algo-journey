/*Rectangular numbers
  -------------------
Print the following pattern for the given number of rows.

Pattern for N = 4

4444444
4333334
4322234
4321234
4322234
4333334  
4444444

Input format : N (Total no. of rows)

Output format : Pattern in N lines

Sample Input :
3

Sample Output :
33333
32223
32123
32223
33333
*/

package CourseTest1;

import java.util.Scanner;

public class RectangularNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		// I am taking idea from spiral printing problem
		int rowS = 0, rowE = 2*n-2; 
		int colS = 0, colE = 2*n-2;
		
		int[][] matrix = new int[2*n-1][2*n-1];
		
		while(n !=0 && rowS <= rowE || colS <= colE) {
			// storing values from first row
			for(int i = colS; i <= colE; i++) {
				matrix[rowS][i] = n;
			}
			rowS++;
			
			// storing values from last column
			for(int i = rowS; i <= rowE; i++) {
				matrix[i][colE] = n;
			}
			colE--;
			
			// storing values from last row
			for(int i = colE; i >= colS; i--) {
				matrix[rowE][i] = n;
			}
			rowE--;
			
			// storing values first column
			for(int i = rowE; i >= rowS; i--) {
				matrix[i][colS] = n;
			}
			colS++;
			n--;
			
			// earlier matrix is in [M*N] form
			// now new matrix is form[M-1*N-1] each time
		}
		
		// printing generated matrix
		for(int i=0; i < matrix.length; i++) {
			for(int j=0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}

	}

}
