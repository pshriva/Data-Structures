package threeSumUsingBruteForce;

import java.util.ArrayList;
import java.util.List;
// the answer contains duplicates and it takes O(n3) time
public class Main {
	public static void main(String args[]){
		int[] arr = {-1,0,2,1,2,-1,-4};
		int target = 0;
		List<int[]> list = getThreeSumValues(arr,target);
		for(int[] a : list){
			System.out.println(a[0] + " " + a[1] + " " + a[2]);
		}
	}

	private static List getThreeSumValues(int[] arr, int target) {
		// TODO Auto-generated method stub
		if(arr.length<3){
			return null;
		}
		List<int[]> list = new ArrayList<>();
		for(int i = 0; i<arr.length-2; i++){
			for(int j = i+1; j<arr.length-1;j++){
				for(int k = j+1;k<arr.length;k++){
					int sum = arr[i] + arr[j] + arr[k];
					if(sum == target){
						list.add(new int[]{arr[i],arr[j],arr[k]});
					}
				}
			}
		}
		return list;
	}
}
