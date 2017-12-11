package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


        //key and value - -store , Key is unique,
		// key - opening bracket, value = closing bracket
		//Map<Key type, Value type>
		// Map - Interface, hashMap - class  which implements Map interface
		//map.containsKey(key) --> boolean
		//map.containsValue(value) -- > boolean
		//map.get(key) --> value
		//map.size() -- > size of map
		// map.isEmpty() --> boolean
public class Parser {

	 
//	public boolean checkParenthesisBalance(String s) {
//		if(s == null || s.length() == 0){return true;}
//		Stack<Character> stack = new Stack<Character>();
//		Map<Character, Character> map = new HashMap<Character, Character>();
//		map.put('(', ')');
//		map.put('{', '}');
//		// keys -- (     {
//		for(int i = 0; i<s.length(); i++){ 
//			char ch = s.charAt(i);
//			if(map.containsKey(ch)){
//				stack.push(ch); 
//			}else if(map.containsValue(ch)){
//				if(!stack.isEmpty() && map.get(stack.peek()) == ch){
//					stack.pop();
//				}else{
//					return false;
//				}
//			}
//		}
//		return stack.isEmpty();
//	}
	///LESS SPACE USED IN THIS METHOD
//	public boolean checkParenthesisBalance(String s) {
//		if(s == null || s.length() == 0){return true;}
//		Stack<Character> stack = new Stack<Character>();
//		for(int i =0; i<s.length(); i++){
//			char c = s.charAt(i);
//			if(c == '{' || c =='('){
//				stack.push(c);
//			}else if(c == '}' || c ==')'){
//				if(!stack.isEmpty()){
//					if((stack.peek() == '(' && c == ')') || (stack.peek() == '{' && c == '}')){
//						stack.pop();
//					}else{
//						return false;
//					}
//				}else{
//					return false;
//				}
//				
//			}
//		}
//		return stack.isEmpty();
//	}
	public boolean checkParenthesisBalance(String s) {
		if(s == null || s.length() == 0){return true;}
		//  (  (  )  (  )()))
		int count = 0;
		for(int i  = 0; i<s.length(); i++){
			char c = s.charAt(i);
			if(c == '('){count++;}
			else if(c == ')'){count--;}
			if(count <0){return false;}
		}
		if(count == 0){return true;}
		return false;
	}
}
