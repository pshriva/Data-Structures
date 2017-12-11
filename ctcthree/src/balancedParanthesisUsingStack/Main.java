package balancedParanthesisUsingStack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// This one is not complete
public class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//boolean isBalanced = isValid(expression);
		String line;
		while((line = in.readLine()) != null && line.length()!= 0){
			boolean b = isValid(line);
			if(b){System.out.println("True");}
			else{System.out.println("False");}
		}
}
	
	private static boolean isValid(String s) {
		// TODO Auto-generated method stub
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			if(c == '(' || c == '[' || c == '{'){
				stack.push(c);
				continue;
			}
			else if(stack.isEmpty() || (c == ')' && stack.peek() != '(') || (c == ']' && stack.peek() != '[') || (c == '}' && stack.peek() != '{')){
				return false;
			}
			stack.pop();
		}
		return stack.isEmpty();
	}
}
