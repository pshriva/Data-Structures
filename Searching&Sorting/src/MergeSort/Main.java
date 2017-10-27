package MergeSort;
// TC: O(nlogn) and SC: O(n)
public class Main {
	public static void main(String args[]){
		int[] arr = {3,6,12,76,23,9,87,12};
		mergeSort(arr, 0, arr.length-1);
		for(int i : arr){
			System.out.println(i);
		}
	}

	private static void mergeSort(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		if(arr.length == 0){
			return;
		}
		if(start < end){
			int mid = start + (end - start)/2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid+1, end);
			merge(arr, start, mid, end);
		}
		
	}

	private static void merge(int[] arr, int start, int mid, int end) {
		// TODO Auto-generated method stub
		int n1 = mid - start + 1;
		int n2 = end - mid;
		int[] left = new int[n1];
		int[] right = new int[n2];
		for(int i = 0; i<n1; i++){
			left[i] = arr[start + i];
		}
		for(int i = 0; i< n2; i++){
			right[i] = arr[mid + 1 + i];
		}
		int i = 0;
		int j = 0;
		int k = start;
		while(i<n1 && j<n2){
			if(left[i] <= right[j]){
				arr[k] = left[i];
				i++;
			}else{
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		while(i<n1){
			arr[k] = left[i];
			i++;
			k++;
		}
		while(j<n2){
			arr[k] = right[j];
			j++;
			k++;
		}
	}
}
