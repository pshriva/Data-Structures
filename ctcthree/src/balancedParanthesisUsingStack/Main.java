package balancedParanthesisUsingStack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

// This one is not complete
public class Main {
	public static void main(String args[]){
		String expression = "(])";
		boolean isBalanced = isValid(expression);
		if(isBalanced == true){
			System.out.println("Parantheses are balanced");
		}else{
			System.out.println("Parantheses are not balanced");
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
