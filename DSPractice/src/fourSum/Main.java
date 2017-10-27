package fourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String args[]){
		int[] arr = {-1, 0, 1, 2, -1, -4};
		int target = -1;
		List<List<Integer>> list = fourSum(arr, target);
		for(List l : list){
			System.out.println(l);
		}
	}
	// sorted: -4, -1, -1, 0, 1, 2
	public static List<List<Integer>> fourSum(int[] nums, int target){
		Arrays.sort(nums);
		List<List<Integer>> result = new ArrayList();
		for(int i = 0 ; i < nums.length - 3 ; i++){
			if(i > 0 && nums[i] == nums[i-1]){
				continue;
			}
			int partial_target = target - nums[i];
			System.out.println("Partial_target " + partial_target);
			System.out.println("fixed value " + nums[i]);
			List<List<Integer>> list = getThreeSum(nums,i,i+1,partial_target);
			for(List l : list){
				result.add(l);
			}
		}
		return result;
		
	}

	private static List<List<Integer>> getThreeSum(int[] nums,int first, int i, int partial_target) {
		// TODO Auto-generated method stub
		System.out.println("INSIDE # SUM" + nums[first]);
		System.out.println("Target here us " + partial_target);
		List<List<Integer>> list = new ArrayList();
		for(int x = i; x < nums.length-2;x++){
			
			if(x>i && nums[x] == nums[x-1]){
				continue;
			}
			System.out.println("checking against " + nums[x]);
			int y = x+1;
			int z = nums.length-1;
			int target = partial_target - nums[x];
			while(y<z){
				if(nums[y] + nums[z] == target){
					list.add(Arrays.asList(nums[first], nums[x], nums[y], nums[z]));
					y++;
					z--;
					while(y<z && nums[y] == nums[y-1])y++;
					while(y<z && nums[z] == nums[z+1])z--;
				}else if(nums[y] + nums[z] > target){
					z--;
				}else{
					y++;
				}
			}
		}
		return list;
	}
}
