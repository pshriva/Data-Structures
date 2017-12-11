package Practice;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parser p =new Parser();
		//String s = "{A{(())}}}";
		String s = "())((()()())";
		boolean isBalanced = p.checkParenthesisBalance(s);
		System.out.println(isBalanced);
	}
}
