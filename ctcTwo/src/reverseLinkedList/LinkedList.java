package reverseLinkedList;

public class LinkedList {
	Node head;
	Node end;
	public LinkedList(){
		head = null;
		end = null;
	}
	public void add(int element) {
		// TODO Auto-generated method stub
		Node n = new Node(element, null);
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
	public boolean reverse() {
		// TODO Auto-generated method stub
		if(head == null){
			return false;
		}
		Node current = head;
		Node next;
		Node previous = null;
		while(current != null){
			next = current.link;
			current.link = previous;
			previous = current;
			current = next;
		}
		head = previous;
		return true;
	}
}
