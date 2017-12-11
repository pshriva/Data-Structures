package MinimumDistinctLocations;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		 int[] a = {7,3,3,1,3,4,1,8};
		 int smallestPath = getSmallestPathCoveringAllDestinations(a);
		 System.out.println(smallestPath);
	}

	private static int getSmallestPathCoveringAllDestinations(int[] a) {
		// TODO Auto-generated method stub
		Set<Integer> distinctDestinations = new HashSet<Integer>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i : a){distinctDestinations.add(i);}
		int left = 0;
		int count = 0;
		int minLen = a.length;
		for(int i = 0; i<a.length; i++){
			if(distinctDestinations.contains(a[i])){
				if(map.containsKey(a[i])){
					//if(map.get(a[i])<1){count++;}
					map.put(a[i], map.get(a[i])+1);
				}else{
					map.put(a[i], 1);
					count++;
				}
				if(count == distinctDestinations.size()){
					while(!distinctDestinations.contains(a[left]) || map.get(a[left]) > 1){
						if(map.containsKey(a[left]) && map.get(a[left]) > 1){
							map.put(a[left], map.get(a[left])-1);
						}
						left++;
					}
					if(i-left+1 <= minLen){
						minLen = i-left + 1;
					}
				}
			}
		}
		return minLen;
	}
}


/*
package SampleTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class MinDestinations {

	public int getMinWindow(int[] A) {
		int n = A.length;
		int visit_count = 0;
		int start = 0;
		int min_len = Integer.MAX_VALUE;
		int count = 0;
		HashMap<Integer, Integer> val_count = new HashMap<Integer, Integer>();
		HashSet<Integer> visited = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			if (!visited.contains(A[i])) {
				visited.add(A[i]);
				visit_count++;
			}
		}
		for (int i = 0; i < n; i++) {
			val_count.put(A[i], val_count.getOrDefault(A[i], 0) + 1);
			if (val_count.get(A[i]) == 1) {
				count++;
			}
			if (count == visit_count) {
				while (val_count.get(A[start]) > 1) {
					if (val_count.get(A[start]) > 1)
						val_count.put(A[start], val_count.get(A[start]) - 1);
					start++;
				}
				int window_len = i - start + 1;
				if (min_len > window_len) {
					min_len = window_len;
				}
			}
		}
		return min_len;
	}

	public static void main(String[] args) {
		int arr[] = { 3, 7, 1, 3, 4,7};
		MinDestinations sol = new MinDestinations();
		System.out.println(sol.getMinWindow(arr));
	}

}
*/