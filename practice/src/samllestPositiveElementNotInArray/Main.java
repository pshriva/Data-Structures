package samllestPositiveElementNotInArray;

import java.util.Arrays;
//smallest positive element not in array
public class Main {
	public static void main (String args[]){
		int[] arr = {0, 1,9,-1,5,2,7};
		int smallestNumber = getSmallestPositive(arr);
		System.out.println(smallestNumber);
    }

	private static int getSmallestPositive(int[] arr) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		if(arr.length == 0 || arr[arr.length-1]<=0){
			return 1;
		}
		for(int i =0; i<arr.length-1;i++){
			if(arr[i]<0 && arr[i+1]>1){
				return 1;
			}
			if(arr[i+1] == arr[i] + 1 || arr[i+1] == arr[i]){
				continue;
			}
			return arr[i]+1;
		}
		return arr[arr.length-1] + 1;
	}
}