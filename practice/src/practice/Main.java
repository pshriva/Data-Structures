package practice;


public class Main {
	public static void main(String args[]){
		int n = 252;
		System.out.println("nth digits is " + findNthDigit(n));
	}

	
	private static int findNthDigit(int n) {
		int base = 9;
		int len = 1;
		while( n >base*len){
			n = n - base*len;
			base = base*10;
			len++;
		}
		int number = base/9 + (n-1)/len;
		int index = (n-1)%len;
		String num = Integer.toString(number);
		char result = num.charAt(index);
		return Character.getNumericValue(result);
	}
	
	
}
