package WiggleSort;

import java.util.Arrays;

/* 
 * Given an unsorted array nums, reorder it in-place such that nums[0] <= nums[1]
>= nums[2] <= nums[3]....
For example, given nums = [3, 5, 2, 1, 6, 4], one possible answer is [1, 6, 2, 5, 3,4].
 * */
public class Main {
	public static void main(String args[]){
		int[] arr = {2,4,1,3,8,9,7};
		wiggleSort(arr);
		for(int i : arr){
			System.out.println(i);
		}
	}

	// SC- O(n)  and TC- minimum - O(nlogn) if Arrays.sort uses merge sort
//	private static void wiggleSort(int[] arr) {
//		// TODO Auto-generated method stub
//		Arrays.sort(arr);
//		int brr[] = new int[arr.length];
//		int left = 0;
//		int right = arr.length - 1;
//		int k = 0;
//		while(left < right){
//			brr[k++] = arr[left];
//			brr[k++] = arr[right];
//			left++;
//			right--;
//		}
//		for(int i = 0; i< arr.length; i++){
//			arr[i] = brr[i];
//		}
//	}
	
//this is inPlace algo but same TC as above
//	private static void wiggleSort(int[] arr){
//		Arrays.sort(arr);
//		for(int i = 1; i<arr.length; i += 2){
//			int temp = arr[i];
//			arr[i] = arr[i-1];
//			arr[i-1] = temp;
//		}
//	}
	
// best approach
	private static void wiggleSort(int[] arr){
		for(int i = 1; i< arr.length; i += 2){
			if(i>0 && arr[i]<arr[i-1]){
				swap(arr, i, i-1);
			}if(i<arr.length-1 && arr[i]< arr[i+1]){
				swap(arr, i,i+1);
			}
		}
	}

	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
