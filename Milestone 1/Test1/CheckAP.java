/*Check AP
  --------
Given input consists of n numbers. Check whether those n numbers form an arithmetic progression or not. Print true or false.

Input format :
Line 1 : n
Line 2 : n numbers

Sample Input 1 :
6
2 6 10 14 18 22

Sample Output 1 :
true

Sample Input 2 :
6
2 6 10 15 19 23

Sample Output 2 :
false
*/

package Test1;

import java.util.Scanner;

public class CheckAP {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int prev = s.nextInt();
		int current = s.nextInt();
//		int count = 3;				//Which number has to be taken now

		int d = current - prev;
		prev = current;

		for(int count=3; count<=n; count++) {
			current = s.nextInt();
			int tempD = current - prev;
			if(tempD != d) {
				System.out.println("false");
				return;
			}
			prev = current;
		}

//		while(count <= n) {						//By While loop
//			current = s.nextInt();
//			int tempD = current - prev;
//			if(tempD != d) {
//				System.out.println("false");
//				return;
//			}
//			count++;
//			prev = current;
//		}
		System.out.println("true");
	}

}
