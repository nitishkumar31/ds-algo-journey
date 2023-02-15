package operators;
import java.util.Scanner;
public class NumberStarPattern1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		
		for(int i=1; i<=N; i++) {
			for(int j=N; j>=1; j--) {
				if(j!=i)
					System.out.print(j);
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}

}
