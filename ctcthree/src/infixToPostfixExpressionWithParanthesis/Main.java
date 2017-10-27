package infixToPostfixExpressionWithParanthesis;
// COnsidering only parenthesis as bracket type
import java.util.HashMap;
import java.util.Map;


public class Main {
	public static void main(String args[]){
		String s = "(A + B)* (C + D)";
		s = getPostfix(s);
		if(s == null){
			throw new IllegalArgumentException("Expression cannot be null");
		}
		System.out.println("Postfix expression is \n" + s);
	}

	private static String getPostfix(String s) {
		// TODO Auto-generated method stub
		if(s.length() == 0){
			return null;
		}
		String result = null;
		Stack stack = new Stack();
		char current;
		for(int  i = 0; i<s.length();i++){
			current = s.charAt(i);
			// if it is white space, then continue
			if(current == ' '){
				continue;
			}
			if(current == '('){
				stack.push(current);
			}
			if(current == ')'){
				//if(result == null){
				if(stack.isEmpty()){
					throw new IllegalArgumentException("Invalid Infix Expression");
				}
				while(!stack.isOpeningBracket()){
						result = result + stack.pop();
						if(stack.isEmpty()){ // if we reach last element of the stack and find no opening bracket
							throw new IllegalArgumentException("Invalid Infix Expression");
						}
				}
				
				stack.pop();
			}
			if(current == '+' ||current == '-' 
			   ||current == '*' ||current == '/' ||current == '%'){
				while(!stack.isEmpty() && !stack.isOpeningBracket() && getHigherPrecedence(stack.top(),current)){
					if(result == null){
						throw new IllegalArgumentException("Invalid Infix Expression");
					}
					result = result + stack.pop();
				}
				stack.push(current);
			}else{
				if(result == null){
					result = String.valueOf(current);
				}else{
					result = result + current;
				}
			}
		}
		while(!stack.isEmpty() && !stack.isOpeningBracket()){
			result = result + stack.pop();
		}
		if(!stack.isEmpty()){
			throw new IllegalArgumentException("Invalid infix Expression");
		}
		return result;
	}

	private static boolean getHigherPrecedence(Object top, char current) {
		// TODO Auto-generated method stub
		Map<Character, Integer> precedence = new HashMap<Character, Integer>();
		precedence.put('+', 0);
		precedence.put('-', 0);
		precedence.put('*', 1);
		precedence.put('/', 1);
		precedence.put('%', 1);
		return precedence.get(top) > precedence.get(current);
	}
}
