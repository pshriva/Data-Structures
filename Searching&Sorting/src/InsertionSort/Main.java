package InsertionSort;
// TC worst case: O[n^2]  and best case : Omega[n], SC- in place
public class Main {
	public static void main(String args[]){
		//int[] arr ={3,2};
		int[] arr = {3,2,4,1,5,3,6,7,8,5,3};
		insertionSort(arr);
		for(int i : arr){
			System.out.println(i);
		}
	}

	private static void insertionSort(int[] arr) {
		// TODO Auto-generated method stub
		if(arr.length == 0){
			return;
		}
		for(int i = 1; i<arr.length; i++){
			int key = arr[i];
//			int j = 0;
//			for(j = i-1; j>=0; j--){
//				if(key< arr[j]){
//					arr[j+1] = arr[j];
//				}else{
//					break;
//				}
//			}
			int j = i-1;
			while(j>=0 && key< arr[j]){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}
}
