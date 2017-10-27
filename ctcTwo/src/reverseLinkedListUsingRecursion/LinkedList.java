package reverseLinkedListUsingRecursion;

public class LinkedList {
	Node head;
	Node end;
	public LinkedList(){
		head = null;
		end = null;
	}
	public void add(int element) {
		// TODO Auto-generated method stub
		Node n = new Node(element);
		if(head == null){
			head = n;
			end = n;
			return;
		}
		end.link = n;
		end = n;
	}
	public void display() {
		// TODO Auto-generated method stub
		Node temp = head;
		while(temp != null){
			System.out.println(temp.data);
			temp = temp.link;
		}
	}
	public void reverseUsingRecursion(Node previous, Node current, Node next) {
		// TODO Auto-generated method stub
		if(current != null){
			next= current.link;
			current.link = previous;
			previous = current;
			current = next;
			reverseUsingRecursion(previous, current, next);
		}
		if(current == null){
			head = previous;
		}
	}
}
