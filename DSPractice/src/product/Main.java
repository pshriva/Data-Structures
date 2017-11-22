package product;
//Given an array of numbers, return an array where each number is the product of all the other numbers in the array at any given index.  

public class Main {
	public static void main(String args[]){
		int[] arr = new int[]{2,3,4,1};
		getArray(arr);
		for(int i : arr){
			System.out.println(i);
		}
	}

	private static void getArray(int[] arr) {
		// TODO Auto-generated method stub
		int product = 1;
		for(int i : arr){
			product *= i;
		}
		for(int i = 0; i<arr.length; i++){
			arr[i] = product/arr[i];
		}
	}
}
