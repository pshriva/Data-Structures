package FibonacciRecursive;

public class Main {
	public static void main(String args[]){
		int n = getFibonacciVariable(1); //gets the 6th number in the fibonacci series
		System.out.println(n);
	}

	private static int getFibonacciVariable(int i) {
		// TODO Auto-generated method stub
		if(i == 1 || i == 2){
			return 1;
		}
		return getFibonacciVariable(i-1) + getFibonacciVariable(i-2);
	}
}
