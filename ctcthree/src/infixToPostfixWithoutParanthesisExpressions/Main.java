package infixToPostfixWithoutParanthesisExpressions;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String args[]){
		String s = "A + B * C - D * E";
		s = getPostfix(s);
		System.out.println(s);
	}

	private static String getPostfix(String s) {
		// TODO Auto-generated method stub
		if(s.length() == 0){
			return null;
		}
		String[] expression = s.split(" ");
		Stack stack = new Stack();
		String result = null;
		for(int i = 0; i<expression.length;i++){
			String temp = expression[i];
			if(temp.equals("+") || temp.equals("-") || temp.equals("*") || temp.equals("/") || temp.equals("%")){
				while(!stack.isEmpty() && hasHigherPriority(stack.top(),temp)){
					if(result == null){
						throw new IllegalArgumentException("Expression is not infix");
					}
					result = result + stack.pop();
				}
				stack.push(temp);
			}else{
				if(result == null){
					result = temp;
				}else{
					result = result + temp;
				}
			}
		}
		while(!stack.isEmpty()){
			result = result + stack.pop();
		}
		return result;
	}

	private static boolean hasHigherPriority(String topStackElement, String current) {
		// TODO Auto-generated method stub
//		switch(operator){
//		case "+":
//		case "-":
//			return 0;
//		case "*":
//		case "/":
//		case "%":
//			return 1;
//		default:
//			throw new IllegalArgumentException("Operator unknown : " + operator);
//		}
		
		// Better use hashmap
		Map<String, Integer> priority = new HashMap<String, Integer>();
		priority.put("+", 0);
		priority.put("-", 0);
		priority.put("*", 1);
		priority.put("/", 1);
		priority.put("%", 1);
		
		return priority.get(topStackElement) >= priority.get(current);
	}
}
