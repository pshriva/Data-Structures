package reverseLinkedListUsingStack;

public class LinkedList { //this is the linkedList class where we have to feed the data and reverse its data using stack class
	Node head;
	public static class Node{
		int element;
		Node next;
		public Node(int element){
			this.element = element;
			next = null;
		}
	}
	public void add(int element) {
		// TODO Auto-generated method stub
		Node n = new Node(element);
		if(head == null){
			head = n;
			return;
		}
		Node temp = head;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = n;
	}
	public void display() {
		// TODO Auto-generated method stub
		if(head == null){
			System.out.println("LinkedList is empty");
			return;
		}
		Node temp = head;
		while(temp != null){
			System.out.println(temp.element);
			temp = temp.next;
		}
	}
	public void reverse() {
		// TODO Auto-generated method stub
		if(head == null){
			throw new ArrayIndexOutOfBoundsException("Linked list is empty");
		}if(head.next == null){
			return;
		}
		Stack s = new Stack();
		Node temp = head;
		while(temp.next != null){
			s.push(temp);
			temp = temp.next;
		}
		head = temp;
		while(s.top != -1){
			temp.next = s.pop();
			temp = temp.next;
		}
		temp.next = null; //this is an imp step as if we do not set the link of our last node to be null, it will point to the previous element as it was pointing before the reversal of the linked list
	}
}
