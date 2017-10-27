package balancedParanthesisUsingStack;

public class Stack {
	Node head;
	int top;
	public Stack(){
		head = null;
		top = -1;
	}
	public void push(char c) {
		// TODO Auto-generated method stub
		Node n = new Node(c);
		if(head == null){
			head = n;
			top++;
			return;
		}
		n.link = head;
		head = n;
		top++;
	}
	public char pop() {
		// TODO Auto-generated method stub
		if(top == -1){
			throw new ArrayIndexOutOfBoundsException("Stack underflow");
		}
		char c = head.data;
		head = head.link;
		top--;
		return c;
	}
}
