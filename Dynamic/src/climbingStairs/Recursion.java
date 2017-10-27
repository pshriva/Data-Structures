package climbingStairs;
//You are climbing a stair case. It takes n steps to reach to the top.

//Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

//Note: Given n will be a positive integer.

public class Recursion {
	public static void main(String args[]){
		int n = 10;
		int ways = getNoOfWaysToClimb(n+1);
		System.out.println(ways);
	}

	private static int getNoOfWaysToClimb(int n) {
		// TODO Auto-generated method stub
		if( n <= 1 ){
			return n;
		}
		
		return (getNoOfWaysToClimb(n-1) + getNoOfWaysToClimb(n-2));
	}
}
