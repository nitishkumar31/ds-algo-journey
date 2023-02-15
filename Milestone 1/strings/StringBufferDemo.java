package strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("abc");
		str.setCharAt(0, 'd');
		System.out.println(str + " " + str.length());
		str.append("def");
		System.out.println(str + " " + str.length());
		str.deleteCharAt(4);
		System.out.println(str + " " + str.length());
		str.insert(3,'z');
		System.out.println(str + " " + str.length());
		
		System.out.println();
		
		StringBuffer str1=new StringBuffer("");
		for(int i=0;i<5;i++)
		{
			str1.append((char)('a'+i));
		}
		System.out.println(str1);
	}

}
