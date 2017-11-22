package MinimumDistinctLocations;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		 int[] a = {7,3,3,1,3,4,1,7};
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
