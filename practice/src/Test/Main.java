package Test;
// ways to complete Krekan
public class Main {
	public static void main(String args[]){
		int m = 2;
		int n = 3;
		int ways = getWays(2, 3);
		System.out.println(ways);
		
	}
//	public static int get(int m , int n){
//		int pascalRow=m+n-1;
//		int targetCol=Math.min(m, n);
//		int count=1;
//		for(int i=1;i < targetCol;i++){
//		count=(count* (pascalRow-i))/i;
//		count = count + Math.min(pascalRow, targetCol);
//		}
//		return count;
//	}
	private static int getWays(int row, int column) {
		// TODO Auto-generated method stub
		if(row == 0 || column == 0){return 0;}
		row = row - 1;
		column = column - 1;
		return getWays(row, column, 0, 0);
	}

	private static int getWays(int row, int column, int i, int j) {
		// TODO Auto-generated method stub
		if(i>row || j >column){
			return 0;
		}
		if(row == i && column == j){
			return 1;
		}
		return (getWays(row, column, i, j+1) + getWays(row, column, i+1, j) + getWays(row, column, i+1, j+1));
	}
//	public static int get(int m, int n){
//		int[][] dp = new int[m][n];
//		return getWays(dp, m,n);
//		
//	}
//
//private static int getWays(int[][] dp, int m, int n) {
//	// TODO Auto-generated method stub
//	if(m == 1 || n == 1){
//		return 1;
//	}
//	return (getWays(dp, m-1, n) + getWays(dp, m, n-1) + getWays(dp, m-1, n-1));
//}
}
