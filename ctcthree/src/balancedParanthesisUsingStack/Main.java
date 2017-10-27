package balancedParanthesisUsingStack;
// This one is not complete
public class Main {
	public static void main(String args[]){
		String expression = "(:()";
		boolean isBalanced = getBalancedStatus(expression);
		if(isBalanced == true){
			System.out.println("Parantheses are balanced");
		}else{
			System.out.println("Parantheses are not balanced");
		}
}
	
	private static boolean getBalancedStatus(String expression) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		for(int i = 0; i<expression.length();i++){
			char c = expression.charAt(i);
			if(c == '(' || c == '{' || c == '['){
				s.push(c);
			}if(c == ')' || c =='}' || c == ']'){
				if(s.top == -1){
					return false;
				}
				char c1 = s.pop();
				if((c1 == '(' && c != ')') || (c1 =='{' && c !='}') || (c1 =='[' && c != ']')){
					break;
				}
			}
		}
		if(s.top == -1){
			return true;
		}
		return false;
	}
}
