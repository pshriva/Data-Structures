package RotateAnArray;

public class Main {
	public static void main(String args[]){
		int[] arr ={1,2,3,4,5,6};
		int k = 3;
		rotateArray(arr,k);
	}

	private static void rotateArray(int[] nums, int k) {
		// TODO Auto-generated method stub
		 if(nums == null || nums.length == 0 || k<0){
	            return;
	        }if(k == nums.length){
	            return;
	        }if(k>nums.length){
	            k =  k%nums.length;
	        }
	        int a = nums.length - k;
	        reverse(nums, 0, a-1);
	        reverse(nums, a, nums.length-1);
	        reverse(nums, 0 , nums.length-1);
		
	}
	 public static void reverse(int[] arr, int startIndex, int lastIndex){
		 int i = 0;
		 int j = 0;
	        for(i = startIndex,j = lastIndex; i <= j ;i++,j--){
	            int temp =arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	        }
	    }
}
