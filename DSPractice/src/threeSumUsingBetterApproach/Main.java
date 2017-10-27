package threeSumUsingBetterApproach;
//  this time the complexity is O(n2)
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String args[]){
		int[] arr = {1,-1,-1,0};
		List<List<Integer>> list = threeSum(arr);
		for(List l : list){
			System.out.println(l);
		}
	}
    public static List<List<Integer>> threeSum(int[] nums) {
    	List<List<Integer>> result = new ArrayList();
        Arrays.sort(nums);
        for(int i = 0; i<nums.length-2; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int j = i+1;
            int k = nums.length - 1;
            int target = -nums[i];
            while(j<k){
                if(nums[j] + nums[k] == target){
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while(j<k && nums[j] == nums[j-1]){
                        j++;
                    }while(j<k && nums[k] == nums[k+1]){
                        k--;
                    }
                }else if(nums[j]+nums[k] < target){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return result;
        
    }
}
