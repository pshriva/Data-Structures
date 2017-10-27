package evaluationOfPrefixExpressionUsingStack;

public class Main {
	public static void main(String args[]){
		String s = " - + 3 * 10 4 5";
		float  result = evaluatePrefixExpression(s);
		if(result == Float.MIN_VALUE){
			System.out.println("The expression is empty");
		}else{
			System.out.println("Expression evaluates to " + result);
		}
	}

	private static float evaluatePrefixExpression(String s) {
		// TODO Auto-generated method stub
		Stack stack = new Stack();
		if(s.length() == 0){
			return Float.MIN_VALUE;
		}
		char c;
		float operand1;
		float operand2;
		for(int i = s.length()-1 ; i>=0; i--){
			c = s.charAt(i);
			if(Character.isWhitespace(c)){
				continue;
			}if(Character.isDigit(c)){ // need to check if the number is more than 1 digit number
				int value = Character.getNumericValue(c);
				System.out.println("next number encountered " + value);
				while(i>=0){
					if(Character.isDigit(s.charAt(i-1))){
						int temp = Character.getNumericValue(s.charAt(i-1));
						System.out.println(temp);
						i--;
						value = value + temp*10;
						System.out.println(value);
					}else{
						break;
					}
				}
				System.out.println("Value is " + value);
				stack.push(value);
			}if(c == '+' || c == '-' || c == '*' || c == '/' || c == '%'){
				if(stack.top < 1){
					throw new ArrayIndexOutOfBoundsException("Invalid Expression");
				}
				operand1 = stack.pop();
				operand2 = stack.pop();
				stack.push(calculate(operand1,operand2,c));
			}
		}
		if(stack.top == 0){
			return stack.pop();
		}
		throw new ArrayIndexOutOfBoundsException("Invalid expression");
	}

	private static float calculate(float operand1, float operand2, char c) {
		// TODO Auto-generated method stub
		if(c == '+')
			return operand1 + operand2;
		if(c =='-')
			return operand1 - operand2;
		if(c == '*')
			return operand1 * operand2;
		if(c == '/')
			return operand1 / operand2;
		if(c == '%')
			return operand1 % operand2;
		throw new ArrayIndexOutOfBoundsException("Invalid operator");
	}
}
