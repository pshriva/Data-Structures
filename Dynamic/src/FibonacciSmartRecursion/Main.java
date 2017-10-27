package FibonacciSmartRecursion;

import java.util.HashMap;
import java.util.Map;
// Top Down Approach
public class Main {
	public static void main(String args[]){
		long n = getFibonacciAt(2);
		System.out.println(n);
	}

	public static long getFibonacciAt(int i) {
		// TODO Auto-generated method stub
		Map<Integer,Long> map = new HashMap<Integer,Long>();
		map.put(1, 1L);
		map.put(2, 1L);
		
		return getFibonacci(i,map);
	}

	private static long getFibonacci(int index, Map<Integer, Long> map) {
		// TODO Auto-generated method stub
		if(map.containsKey(index)){
			return map.get(index);
		}
		long entryAtIndex = getFibonacci(index-1,map) + getFibonacci(index-2,map);
		map.put(index, entryAtIndex);
		return entryAtIndex;
	}
}
