package practice;

public class RotatedMin {
	public static void main(String[] args){
		int[] nums = {4,5,6,7,-1,1,2};
		int min = returnMin(nums);
		System.out.println(min);
	}

	private static int returnMin(int[] nums) {
		int min = 0;
		int start = 0;
		int end = nums.length-1;
		int mid = 0;
		while(start<=end){
				mid = (end+start)/2;
				if(nums[mid]>nums[mid+1]){
					return nums[mid+1];
				}
				if(nums[mid]>nums[end]){
				start = mid + 1;
				}
				else{
				end = mid -1;
				}
		}
		return nums[mid];
		
	}

}
