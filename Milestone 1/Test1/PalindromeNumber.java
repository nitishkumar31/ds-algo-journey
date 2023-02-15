/*Palindrome number
  -----------------
Write a program to determine if given number is palindrome or not. Print true if it is palindrome, false otherwise.

Palindrome are the numbers for which reverse is exactly same as the original one. For eg. 121

Sample Input 1 :
121

Sample Output 1 :
true

Sample Input 2 :
1032

Sample Output 2 :
false
*/

package Test1;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int revNum=0;
		for(int i=n; i>0; i=i/10) {
			revNum = revNum*10 + i%10;
		}
		
//		int temp = n, revNum= 0;					//By While loop
//		while (temp>0) {
//			int lastDigit = temp % 10;
//			temp = temp/10;
//			revNum = revNum*10 + lastDigit;
//		}
			
		if(n==revNum)
			System.out.println("true");
		else
			System.out.println("false");

	}

}
