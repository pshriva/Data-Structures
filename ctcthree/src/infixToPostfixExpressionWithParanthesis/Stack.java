package infixToPostfixExpressionWithParanthesis;

public class Stack {
	Node head;
	int top;
	public Stack(){
		head = null;
		top = -1;
	}
	public void push(char current) {
		// TODO Auto-generated method stub
		Node n = new Node(current);
		if(head == null){
			head = n;
			top++;
			return;
		}
		n.link = head;
		head = n;
		top++;
	}
	public boolean isOpeningBracket() {
		// TODO Auto-generated method stub
		return head.data =='(';
	}
	public char pop() {
		// TODO Auto-generated method stub
		char c = head.data;
		head = head.link;
		top--;
		return c;
	}
	public Object top() {
		// TODO Auto-generated method stub
		return head.data;
	}
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top == -1;
	}
}
