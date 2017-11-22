package findTheCelebrity;

public class Main {
	public static void main(String args[]){
		int n = 10;
		int celeb = findCelebrity(n);
	}

//	// Brute force -- start
//	private static int findCelebrity(int n) {
//		// TODO Auto-generated method stub
//		int count = 0;
//		for(int i = 0; i<n; i++){
//			for(int j = 0; j<n ; j++){
//				if(i != j && !knows(i, j) && knows(j, i)){count++;}
//			}
//			if(count == (n-1)){
//				return i;
//			}
//		}
//		return -1;
//		// count becomes (n-1) when the person 'i' does not know anybody, and he is only supposed to be the celebrity
//	}
//
//	//STUB API
//	private static boolean knows(int i, int j) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//	// Brute force -- end
//	******************************************
//	//BruteForce and same with TC but increasing SC -- start
//	private static int findCelebrity(int n){
//		int[] knows = new int[n];
//		int[] known = new int[n];
//		for(int i = 0; i < n; i++){
//			for(int j = 0; j < n ; j++){
//				if(i != j && knows(i, j)){
//					knows[i]++;
//					known[j]++;
//				}
//			}
//		}
//		for(int i = 0; i<n; i++){
//			if(known[i] == n-1 && knows[i] == 0){
//				return i;
//			}
//		}
//		return -1;
//	}
//
//	private static boolean knows(int i, int i2) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//	//  bruteforce -- end
//	**************************
	//There are 2 O(n) ways, but the 1st one is even faster but complexity is O(n) only
	//First:
// BEST APPROACH 1 -- START
//	public static int findCelebrity(int n){
//		if(n <=1){return -1;}
//		int celebrity = 0;
//		for(int i = 1; i<n; i++){
//			if(knows(celebrity, i)){celebrity = i;}
//		}
//		for(int i = 0; i< n; i++){
//			if(i != celebrity && (!knows(i, celebrity) || knows(celebrity, i))){
//				return -1;
//			}
//		}
//		return celebrity;
//	}
//	private static boolean knows(int celebrity, int i) {
//		// TODO Auto-generated method stub
//		return false;
//	}
	// BEST APPROACH 1 -- END
	//****************
	// BEST APPROACH 2 -- START
	public static int findCelebrity(int n){
		if(n <= 1){return -1;}
		int left = 0; int right = n-1;
		while(left < right){
			if(knows(left, right)){left++;}
			else{right--;}
		}
		for(int i = 0; i< n; i++){
			if(i != right && (!knows(i, right) || knows(right, i))){
				return -1;
			}
		}
		return right;
	}

	private static boolean knows(int left, int right) {
		// TODO Auto-generated method stub
		return false;
	}
	// BEST APPROACH 2 -- END
//public class Solution extends Relation {
//    public int findCelebrity(int n) {
//        if (n <= 1) {
//            return -1;
//        }
//         
//        int left = 0;
//        int right = n - 1;
//         
//        // Step 1: Find the potential candidate
//        while (left < right) {
//            if (knows(left, right)) {
//                left++;
//            } else {
//                right--;
//            }
//        }
//         
//        // Step 2: Validate the candidate
//        int candidate = right;
//        for (int i = 0; i < n; i++) {
//            if (i != candidate && (!knows(i, candidate) || knows(candidate, i))) {
//                return -1;
//            }
//        }
//         
//        return candidate;
//    }

	
}