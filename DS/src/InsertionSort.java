
//iterative version

public class InsertionSort {

	public static void main(String args[]){
		int arr[] = {91,42,59,26,41,58};
		for(int i=1; i<arr.length;i++){
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>key){
				arr[j+1] = arr[j];
				j--;
			}
				arr[j+1]=key;
		}
		System.out.println("array after sorting");
		for(int a: arr){
			System.out.println(a);
		}
	}
}
