package maxHeapify;
// TC O[n] and SC = O[logn]
public class Main {
	public static void main(String args[]){
		int[] arr = {4,3,5,23,54,2,76,8,4,34,6};
		buildMaxHeap(arr);
		for(int i = 0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}

	private static void buildMaxHeap(int[] arr) {
		// TODO Auto-generated method stub
		for(int i = arr.length/2 -1 ; i>=0 ; i--){
			maxHeapify(arr, i);
		}
	}
	private static void maxHeapify(int[] arr, int i) {
		// TODO Auto-generated method stub
		int leftChildIndex = 2*i + 1;
		int rightChildIndex = 2*i + 2;
		int largest = 0;
		if(leftChildIndex < arr.length && arr[i] < arr[leftChildIndex]){
			largest = leftChildIndex;
		}
		else{
			largest = i;
		}
		if(rightChildIndex < arr.length && arr[rightChildIndex] > arr[largest]){
			largest = rightChildIndex;
		}
		if(largest != i){
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			maxHeapify(arr, largest);
		}
	}
}
