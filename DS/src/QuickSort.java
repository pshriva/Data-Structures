
public class QuickSort {
	public static void main(String args[]){
		int arr[] = {12,32,1,45,3,65};
		QuickSort qs =new QuickSort();
		qs.quickSort(arr,0,5);
		System.out.println("After sorting");
		for(int i:arr){
			System.out.println(i);
		}
		
	}

	void quickSort(int[] arr, int p, int r) {
		// TODO Auto-generated method stub
		if(p<r){
			int q = partition(arr,p,r);
			quickSort(arr,p,q-1);
			quickSort(arr,q+1,r);
	}
}

	int partition(int[] arr, int p, int r) {
		// TODO Auto-generated method stub
		int temp;
		int i =p-1;
		for(int j = p ;j<r; j++){
			if(arr[j]<=arr[r]){
				i = i+1;
				temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		temp = arr[i+1];
		arr[i+1] = arr[r];
		arr[r] = temp;
		return i+1;
	}
}
