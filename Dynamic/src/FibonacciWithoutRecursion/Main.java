package FibonacciWithoutRecursion;

//This solution is iterative, it has the same complexity as the earlier solution, the smart recursion, but it takes no stack space
public class Main {
	public static void main(String args[]){
		int n = getFiboacciAt(7);
		System.out.println(n);
	}

	private static int getFiboacciAt(int i) {
		// TODO Auto-generated method stub
		int[] fibonacci = new int[i];
		fibonacci[0] = 1;
		fibonacci[1] = 1;
		int j = 0;
		for(j = 2;j<i;j++){
			fibonacci[j] = fibonacci[j-1] + fibonacci[j-2];
		}
		return fibonacci[i-1];
	}
}
