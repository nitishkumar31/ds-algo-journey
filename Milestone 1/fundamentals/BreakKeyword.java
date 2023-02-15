package fundamentals;

public class BreakKeyword {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i+1==j){
					break;
//					return;
				}
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

}
