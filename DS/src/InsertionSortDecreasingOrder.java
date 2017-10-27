//iterative version
public class InsertionSortDecreasingOrder {

	public static void main(String args[]){
		int j = 0;
		int flag = 0;
		int arr[] = {91,42,59,26,41,58};
		for(int i=1; i<arr.length;i++){
			int key = arr[i];
			j = i-1;
			while(j>=0 && arr[j]<key){
				arr[j+1] = arr[j];
				j--;
			}
				arr[j+1]=key;
		}
		System.out.println("array after sorting in decreasing order");
		for(int a: arr){
			System.out.println(a);
		}
	}
}
