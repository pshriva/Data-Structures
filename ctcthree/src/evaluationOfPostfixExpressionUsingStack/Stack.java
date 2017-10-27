package evaluationOfPostfixExpressionUsingStack;

public class Stack {
	Node head;
	int top;
	public Stack(){
		head = null;
		top =-1;
	}
	public void push(float f) {
		// TODO Auto-generated method stub
		Node n = new Node(f);
		if(head == null){
			head = n;
			top++;
			return;
		}
		n.link = head;
		head = n;
		top++;
	}
	public float pop() {
		// TODO Auto-generated method stub
		if(top == -1){
			throw new ArrayIndexOutOfBoundsException("Stack underflow");
		}
		float result = head.data;
		head = head.link;
		top--;
		return result;
	}
}
