package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SolutionForTree {
	public static void main(String args[]){
		int[]  A = new int[]{2,2,1,1,2,1,2,3,3,3,1,1};
		int[] E = new int[]{1,2,1,3,2,4,2,5,3,6,4,7,4,8,5,9,5,10,6,11,11,12};
		int len = getMaxLength(A, E);
		System.out.println(len);
	}

	private static int getMaxLength(int[] a, int[] e) {
		// TODO Auto-generated method stub
		Map<Integer, List<Integer>> adjacencyList = new HashMap<Integer, List<Integer>>();
		for(int i = 0; i< e.length; i+=2){
			if(adjacencyList.containsKey(e[i])){
				adjacencyList.get(e[i]).add(e[i+1]);
			}else{
				adjacencyList.put(e[i], new ArrayList(Arrays.asList(e[i+1])));
			}
		}
		for(int i : adjacencyList.keySet()){
			System.out.println(i + " " + adjacencyList.get(i));
		}
		return 0;
	}
}
