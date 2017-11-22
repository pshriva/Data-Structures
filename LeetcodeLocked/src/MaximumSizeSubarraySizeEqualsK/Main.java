package MaximumSizeSubarraySizeEqualsK;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String args[]){
		int[] arr = {6,3,3,0,2,2,2,2,1,2,0,0,0,0,1};
		int k = 6;
		int max = maxSubArrayLen(arr, k);
		System.out.println(max);
	}

	private static int maxSubArrayLen(int[] arr, int k) {
		int max = 0;
		int sum = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i<arr.length; i++){
			sum += arr[i];
			if(sum == k){
				max = i + 1;
			}
			else if(map.containsKey(sum - k)){
				max = Math.max(max, i - map.get(sum-k));
			}
			if(!map.containsKey(sum)){map.put(sum, i);}
		}
		return 0;
	}

//	private static int maxSubArrayLen(int[] arr, int k) {
//		// TODO Auto-generated method stub
//		int max = 0;
//		int sum = 0;
//		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
//		for(int i = 0; i < arr.length; i++){
//			sum = sum + arr[i];
//			if(sum == k){max = i+1;}
//			else if(map.containsKey(sum-k)){max = Math.max(max, i - map.get(sum-k));}
//			if(!map.containsKey(sum)){map.put(sum, i);}
//		}
//		return max;
//	}
}
