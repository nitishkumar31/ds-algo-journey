package arrays;

public class IncrementArray {
	
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static int[] incrementArray(int[] input) {
//		input = new int[7];
		for(int i=0; i<input.length; i++) {
			input[i] = input[i]+1;
		}
		return input;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
//		incrementArray(arr);
		arr = incrementArray(arr);
		printArray(arr);
		
	}
}
