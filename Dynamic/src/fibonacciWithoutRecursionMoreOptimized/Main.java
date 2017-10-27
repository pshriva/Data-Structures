package fibonacciWithoutRecursionMoreOptimized;

public class Main {
	public static void main(String args[]){
		int n = getFibonacciAt(3);
		System.out.println(n);
	}

	private static int getFibonacciAt(int i) {
		// TODO Auto-generated method stub
		if(i == 1 || i == 2){
			return 1;
		}
		int current = 0;
		int last = 1;
		int secondLast = 1;
		for(int j = 2; j<i ; j++){
			current = last + secondLast;
			secondLast = last;
			last = current;
		}
		return current;
	}
}
