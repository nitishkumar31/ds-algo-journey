/*Pair Star
  ---------
Given a string S, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".

Input format :
String S

Output format :
Modified string

Constraints :
0 <= |S| <= 1000
where |S| represents length of string S.

Sample Input 1 :
hello

Sample Output 1:
hel*lo

Sample Input 2 :
aaaa

Sample Output 2 :
a*a*a*a
*/

package recursionAssignments;

import java.util.Scanner;

public class pairStar {
	
	public static String addStar(String s) {
		if(s.length() == 1) {
//			System.out.println(s);
			return s;
	}
		
		String smallAns = addStar(s.substring(1));
//		System.out.println(s +" " + smallAns);
		if(s.charAt(0) == smallAns.charAt(0)) {
			return s.charAt(0) + "*" + smallAns;
		} else {
			return s.charAt(0) + smallAns;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(addStar(s));
	}

}
