package evaluationOfPrefixExpressionUsingStack;
public class Stack {
	Node head;
	int top;
	public Stack(){
		head = null;
		top = -1;
	}
	public void push(float numericValue) {
		// TODO Auto-generated method stub
		Node n = new Node(numericValue);
		if(head == null){
			head = n;
			top++;
			return;
		}
		n.link = head;
		head = n;
		top++;
		return;
	}
	public float pop() {
		// TODO Auto-generated method stub
		if(head == null){
			throw new ArrayIndexOutOfBoundsException("Stack underflow");
		}
		float element = head.data;
		head = head.link;
		top--;
		return element;
	}
}
