package stackUsingLinkedList;

public class LinkedList {
	Node top;
	public LinkedList(){
		top = null;
	}
	static class Node{
		int data;
		Node link;
		public Node(int data){
			this.data = data;
			link = null;
		}
	}
	public void add(int element) {
		// TODO Auto-generated method stub
		Node n = new Node(element);
		if(top == null){
			top = n;
			return;
		}
		n.link = top; // always adding new element at the top of LL and removing also from top so as to maintain the O(1) time
		top = n;
	}
}
