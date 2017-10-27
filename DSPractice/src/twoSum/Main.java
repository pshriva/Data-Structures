package twoSum;

import java.util.HashMap;

public class Main {
	public static void main(String args[]){
		int[] arr = {2,7,11,15};
		int target = 17;
		int[] indexes = getTwoSumIndexes(arr,target);
		System.out.println("Elements that sum up to the target value are at indexes:");
		for(int i:indexes){
			System.out.println(i);
		}
	}

	private static int[] getTwoSumIndexes(int[] arr, int target) {
		// TODO Auto-generated method stub
		if(arr == null || arr.length<2){
			return new int[]{0,0};
		}
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i = 0; i<arr.length;i++){
			if(map.containsKey(arr[i])){
				return new int[]{map.get(arr[i]),i};
			}else{
				map.put(target-arr[i], i);
			}
		}
		return new int[]{0,0};
	}
}
