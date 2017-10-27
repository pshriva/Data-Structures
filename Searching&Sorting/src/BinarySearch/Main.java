package BinarySearch;

public class Main {
	public static void main(String[] args){
		int[] arr = {3,5,8,9,10,15,17};
		int n = 2;
		boolean b = search(arr, 0, arr.length-1, n);
		if(b == true){
			System.out.println("Exists");
		}else{
			System.out.println("Does not exist");
		}
	}

	private static boolean search(int[] arr, int start, int end, int n) {
		// TODO Auto-generated method stub
		if(start<=end){
			int mid = start + (end - start)/2;
			if(arr[mid] == n){
				return true;
			}if(n < arr[mid]){
				return search(arr, start, mid-1, n);
			}
			return search(arr, mid+1, end, n);
		}
		
		return false;
	}
}
