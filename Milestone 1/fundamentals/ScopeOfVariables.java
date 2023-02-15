package fundamentals;

public class ScopeOfVariables {

	public static void main(String[] args) {
		
		int i =1;
		int j =10;
		while(i<=5) {
			j=10;
			System.out.println(j);
			i++;
			j++;
		}
		
		System.out.println(i);
		System.out.println(j);
	}

}
