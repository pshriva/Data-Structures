package postfixEvaluationBetterWay;

public class Main {
	public static void main(String args[]){
		String s = "3 2 50 * + ";
		float result  = evaluateExpression(s);
		System.out.println("It evaluates to " + result);
	}

	public static float evaluateExpression(String s) {
		// TODO Auto-generated method stub
		Stack stack = new Stack();
		String[] s1 = s.split(" ");
		for(int i = 0; i<s1.length;i++){
			String s2 = s1[i];
			if(s2.equals("+") || s2.equals("-") || s2.equals("*") || s2.equals("/") || s2.equals("%")){
				if(stack.top <1){
					throw new ArrayIndexOutOfBoundsException("Invalid expression");
				}
				float operand2 = stack.pop();
				float operand1 = stack.pop();
				float result = calculate(operand1, operand2, s2);
				stack.push(result);
			}else{
				float m = Float.parseFloat(s2);
				stack.push(m);
			}
		}
		if(stack.top == 0){
			return stack.pop();
		}
		throw new ArrayIndexOutOfBoundsException("Invalid expression");
	}

	private static float calculate(float operand1, float operand2, String s2) {
		// TODO Auto-generated method stub
		if(s2.equals("+")){
			return operand1 + operand2;
		}
		if(s2.equals("-")){
			return operand1 - operand2;
		}
		if(s2.equals("*")){
			return operand1 * operand2;
		}
		if(s2.equals("/")){
			return operand1 / operand2;
		}
		if(s2.equals("%")){
			return operand1 % operand2;
		}
		throw new ArrayIndexOutOfBoundsException("Invalid operator");
	}
}
