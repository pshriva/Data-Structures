package DivideTwoIntegers;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dividend = 100;
		int divisor = 5;
		int quotient = getQuotient(dividend, divisor);
		System.out.println(quotient);
	}

	private static int getQuotient(int dividend, int divisor) {
		// TODO Auto-generated method stub
		int resultantQuotient = 0;
		while(dividend >= divisor){
			int current = divisor;
			int count = 0;
			while(dividend >= (current<<1)){
				current = current << 1;
				count++;
			}
			int i = 0;
			int quotient = 1;
			while(++i<=count){
				quotient = quotient << 1;
			}
			resultantQuotient += quotient;
			dividend = dividend - current;
		}
		
		
		return resultantQuotient;
	}

}
