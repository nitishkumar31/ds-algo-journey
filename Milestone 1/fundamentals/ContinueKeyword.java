package fundamentals;

public class ContinueKeyword {

	public static void main(String[] args) {
		int i=1;
		int n=5;
		while(i<=n) {
//			i++;
			if(i==4) {
				i++;
//				break;
				continue;
			}
			i++;
			System.out.println(i);
		}

	}

}
