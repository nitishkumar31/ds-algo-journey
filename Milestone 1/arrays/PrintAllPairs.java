package arrays;

public class PrintAllPairs {


	public static void printAllPairs(int[] arr){
		int n = arr.length;
		for(int i=0; i<n-1; i++){
			for(int j=i+1; j<n; j++){
				System.out.println("(" + arr[i] + "," + arr[j] + ")");
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {1,4,7,6,5};
		printAllPairs(arr);
	}
}
