package QuickSort;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String args[]){
		int[] arr = {23,43,1,65,34,87,12,45};
		quickSort(arr, 0, arr.length-1);
		for(int i: arr){
			System.out.println(i);
		}
	}

	private static void quickSort(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		if(start < end){
			int q = partition(arr, start, end);
			quickSort(arr, start, q-1);
			quickSort(arr, q+1, end);
		}
	}

	private static int partition(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		int x = arr[end];
		int i = start - 1;
		int j = start;
		for(j = start; j <= end - 1; j++){
			if(arr[j] <= x){
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[end];
		arr[end] = temp;
		return i+1;
	}
}
