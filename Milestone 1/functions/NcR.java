package functions;

import java.util.Scanner;
public class NcR {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = s.nextInt();
		System.out.println("Enter r:");
		int r = s.nextInt();
		
		int factN=1,factR=1,factNR=1;
		for(int i=2;i<=n;i++)
		{
			factN*=i;
			if(i<=r)
				factR*=i;
			if(i<=n-r)
				factNR*=i;
		}
		int NcR=factN/(factR*factNR);
		System.out.print(NcR);
	}

}
