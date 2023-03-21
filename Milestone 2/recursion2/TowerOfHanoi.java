package recursion2;

import java.util.Scanner;

public class TowerOfHanoi {
	
	public static void towerOfHanoi(int nDisk, char source, char auxiliary, char destination) {
		if(nDisk == 0)
			return;
		
		towerOfHanoi(nDisk - 1, source, destination, auxiliary);
		System.out.println("move " + nDisk + "th disk from " + source + " to " + destination);
		towerOfHanoi(nDisk - 1, auxiliary, source, destination);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		towerOfHanoi(n, 'a', 'b', 'c');
	}

}
