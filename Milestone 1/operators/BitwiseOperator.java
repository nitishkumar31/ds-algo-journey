package operators;

public class BitwiseOperator {

	public static void main(String[] args) {
		int a=10;
		int b=2;

		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(~a);
		
		System.out.println(a<<1);
		System.out.println(a<<3);
		
		System.out.println(a>>1);
		System.out.println(a>>2);
		
		System.out.println(b+=1);
		System.out.println(b^=1);
	}

}
