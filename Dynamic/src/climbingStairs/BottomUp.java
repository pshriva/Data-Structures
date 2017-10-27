package climbingStairs;

public class BottomUp {
	public static void main(String args[]){
		int n = 10;
		int ways = getWays(n);
		System.out.println(ways);
	}

	private static int getWays(int n) {
		// TODO Auto-generated method stub
		int last = 1;
	    int secondLast = 1;
	    if(n <= 1){
	    	return n;
	    }
		int current = 0;
		for(int i = 3; i<= n+1; i++){
			current = last + secondLast;
			secondLast = last;
			last = current;
		}
		return current;
	}
}
