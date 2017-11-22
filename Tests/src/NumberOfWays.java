
//Gold. number of ways to cover n stairs taking either 1,2 or 3 stairs at a time
public class NumberOfWays {
	public static void main(String args[]){
		int n = 4;
		System.out.println(countSteps(n));
	}

	static long countSteps(int n) {
		  if(n<0){return 0;}
	        if(n <= 1){return n;}
	        return numberOfWays(n);
    }
// static long numberOfWays(int n){
//    long[] count = new long[n+1];
//    count[0] = 1;
//    count[1] = 1;
//    count[2] = 2;
//    for(int i = 3; i<=n ; i++){
//        count[i] = count[i-1] + count[i-2] + count[i-3];
//    }
//    return count[n];
//}
	static long numberOfWays(int n){
	    //long[] count = new long[n+1];
	    long thirdLast = 1;
	    long secondLast = 1;
	    long last = 2;
	    long current = last;
	    for(int i = 3; i<=n ; i++){
	        current = last + secondLast + thirdLast;
	        thirdLast = secondLast;
	        secondLast = last;
	        last = current;
	    }
	    return current;
	}
}
