package climbingStairs;

import java.util.HashMap;
import java.util.Map;

public class recursionWithDP {
	public static void main(String args[]){
		int n = 10;
		long ways = getWays(n+1);
		System.out.println(ways);
	}

	private static long getWays(int n) {
		// TODO Auto-generated method stub
		Map<Integer,Long> dp = new HashMap<Integer, Long>();
		dp.put(1, 1L);
		dp.put(2, 1L);
		return choices(dp, n);
	}

	private static long choices(Map<Integer,Long> dp, int n) {
		// TODO Auto-generated method stub
		if(dp.containsKey(n)){
			return dp.get(n);
		}
		dp.put(n, (choices(dp, n-1) + choices(dp, n-2)));
		return dp.get(n);
	}
}
