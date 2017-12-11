package p;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	
	public static void main(String args[]) throws IOException{
	
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line = in.readLine()) != null && line.length()!= 0){
			String[] s = line.split(",");
			int distinctOccurances = getDistinctOccurances(s[0], s[1],0,0);
			System.out.println(distinctOccurances);
		}
	
	}

	
	public static int getDistinctOccurances(String X, String Z, int i, int j) { 
		if (j == Z.length()) { 
		  if (i == X.length() && X.charAt(i - 1) != Z.charAt(j - 1)) 
		     return 0; 
		  return 1; 
		  } 
		  if (i == X.length()) 
		     return 0;
		  if (X.charAt(i) == Z.charAt(j)) 
		     return getDistinctOccurances(X, Z, i + 1, j + 1) + getDistinctOccurances(X, Z, i + 1, j); 
		  return getDistinctOccurances(X, Z, i + 1, j);
	}
}

//private static int getDistinctOccurances(String X, String Z) {
//	int strLen = X.length();
//	int subLen = Z.length();
//	int[][] dp = new int[strLen + 1][subLen + 1];
//	for (int i = 0; i < strLen; i++){
//		dp[i][0] = 1;
//	}
// 
//	for (int i = 1; i <= strLen; i++) {
//		for (int j = 1; j <= subLen; j++) {
//			if (X.charAt(i - 1) == Z.charAt(j - 1)) {
//				dp[i][j] += dp[i - 1][j] + dp[i - 1][j - 1];
//				continue;
//			}
//			dp[i][j] += dp[i - 1][j];
//		}
//	}
//	return dp[strLen][subLen];
//}