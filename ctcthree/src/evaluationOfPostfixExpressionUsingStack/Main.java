package evaluationOfPostfixExpressionUsingStack;

//assuming all numbers in the string are single digit numbers
public class Main {
	public static void main(String args[]){
		String s = "3 2 50 * + ";		
		float evaluation = evaluateExpression(s);
		System.out.println("Result of expression is " + evaluation);
	}

	private static float evaluateExpression(String s){
		// TODO Auto-generated method stub
		Stack stack = new Stack();
		for(int i = 0; i<s.length();i++){
			char c = s.charAt(i);
			if(Character.isWhitespace(c)){
				continue;
			}
			if(Character.isDigit(c)){
				float value = Character.getNumericValue(c);
				while(i < s.length()){
					if(Character.isDigit(s.charAt(i+1))){
						value = value*10 + Character.getNumericValue(s.charAt(i+1));
						i++;
					}else{
						break;
					}
				}
				stack.push(value);
			}
			if(c == '+' || c == '-' || c == '*' || c== '/' || c == '%'){
				if(stack.top < 1){
					throw new ArrayIndexOutOfBoundsException("Invalid Expression");
				}
				float operand2 = stack.pop();
				float operand1 = stack.pop();
				stack.push(calculate(operand1, operand2, c));
			}
		}
		float result = stack.pop();
		if(stack.top == -1){
			return result;
		}
		throw new ArrayIndexOutOfBoundsException("Invalid expression");
	}

	private static float calculate(float operand1, float operand2, char c) {
		// TODO Auto-generated method stub
		if(c == '+'){
			return (operand1 + operand2);
		}if(c == '-'){
			return operand1 - operand2;
		}if(c == '*'){
			return operand1 * operand2;
		}if(c == '/'){
			return operand1 / operand2;
		}if(c == '%'){
			return operand1 % operand2;
		}
		throw new ArrayIndexOutOfBoundsException("Invalid operator");
	}
}
