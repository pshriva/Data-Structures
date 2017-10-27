package reverseLinkedListUsingStack;
//Stack can itself be implemented using either array or linkedlist, we are using LinkedList to implement stack
public class Stack {
	Node start;
	int top;
	public Stack(){
		start = null;
		top = -1;
	}
	public static class Node{
		reverseLinkedListUsingStack.LinkedList.Node data;
		Node link;
		public Node(reverseLinkedListUsingStack.LinkedList.Node data){
			this.data = data;
			link = null;
		}
	}
	public void push(reverseLinkedListUsingStack.LinkedList.Node next) { //pushing an element to stack, here we are using linkedlist to implement stack, so pushing is equivalent to adding an element to linkedlist (at head so as to maintain O(1) TC)
		// TODO Auto-generated method stub
		Node n = new Node(next);
		if(start == null){
			start = n;
			top++;
			return;
		}
		n.link = start;
		start = n;
		top++;
	}
	public reverseLinkedListUsingStack.LinkedList.Node pop() {
		// TODO Auto-gene;rated method stub
		Node n = start;
		if(start == null){
			throw new ArrayIndexOutOfBoundsException("LinkedList is empty");
		}
		reverseLinkedListUsingStack.LinkedList.Node node = start.data;
		start = start.link;
		top--;
		return node;
	}
}
