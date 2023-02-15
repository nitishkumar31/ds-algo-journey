package strings;

public class StringComparison {

	public static void main (String[] args) {
		String str1="abc";
		String str2="abc";
		String str3=new String("abc");
		
		System.out.println(str1==str2);	// true
		System.out.println(str1==str3);	// false
		// coz '==' operator comparing references of these strings
		
		System.out.println(str1.equals(str2));	// true
		System.out.println(str1.equals(str3));	// true
		// coz '.equals()' comparing literals/contents of these strings
	}
	
}