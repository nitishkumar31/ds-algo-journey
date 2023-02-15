package arrays;

public class BasicsOfArrays {

	public static void main(String[] args) {
		
		int arr[] = new int[10];
		arr[0] = 5;
		arr[5] = 17;
		System.out.println(arr[0]);			//5
		System.out.println(arr[5]);			//17
		
		System.out.println(arr[3]);			//0
		
		char chArray[] = new char[10];
		double dArray[] = new double[10];
		System.out.println(chArray[0]);		//null character
		System.out.println(dArray[0]);		//0.0
		
		boolean boArray[] = new boolean[5];
		System.out.println(boArray[0]);		//Whenever an boolean array is created, 
											// all elements are initialized to false.
		
	}

}
