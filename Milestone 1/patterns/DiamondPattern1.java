/*
Input 1:
5

Output 1:
  *
 ***
*****
 ***
  *

Input 2:
6

Output 2:
   *
  ***
 *****
*******
 *****
  ***
   *

*/

package patterns;

import java.util.Scanner;

public class DiamondPattern1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int mid=n/2;
		for(int i = 1; i <=mid +1 ; i++){
			for(int k = 1; k <= mid-i+1; k++) 
				System.out.print(" ");
			for(int j = 1; j <= i*2 -1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = mid; i >= 1; i--){
			for(int k = mid-i; k >=0; k--) 
				System.out.print(" ");
			for (int j = i*2 - 1; j >=1; j--){
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
