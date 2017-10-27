package infixToPostfixWithoutParanthesisExpressions;

public class Stack {
	Node head;
	int top;
	public Stack(){
		head = null;
		top = -1;
	}
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top == -1;
	}
	public String top() {
		// TODO Auto-generated method stub
		return head.data;
	}
	public String pop() {
		// TODO Auto-generated method stub
		String data = head.data;
		head = head.link;
		top--;
		return data;
	}
	public void push(String temp) {
		// TODO Auto-generated method stub
		Node n = new Node(temp);
		n.link = head;
		head = n;
		top++;
	}
}
