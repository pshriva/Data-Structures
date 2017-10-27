package doublyLinkedList;

public class LinkedList {
	Node head;
	Node end;
	int count;
	public LinkedList(){
		head = null;
		end  = null;
		count = 0;
	}
	public void add(int element) {
		// TODO Auto-generated method stub
		Node n = new Node(element);
		if(head == null){
			head = n;
			end = n;
			count++;
			return;
		}
		end.next = n;
		n.previous = end;
		end = n;
		count++;
	}
	public void display() {
		// TODO Auto-generated method stub
		Node n = head;
		while(n != null){
			System.out.println(n.data);
			n = n.next;
		}
	}
	public void delete(int index) {
		// TODO Auto-generated method stub
		if(head == null){
			throw new ArrayIndexOutOfBoundsException("LinkedList Underflow");
		}
		if(index < 0 || index >= count){
			throw new ArrayIndexOutOfBoundsException("Invalid Index");
		}
		int i = 0;
		Node n = head;
		while(i != index){
			n = n.next;
			i++;
		}
		if(n == head){ //deleting 1st element
			head = n.next;
			head.previous = null;
			count--;
			return;
		}
		if(n.next == null){ //deleting last element
			n.previous.next = null;
			count--;
			return;
		}
		n.previous.next = n.next;
		n.next.previous = n.previous;
		count--;
	}
	public void insertAtIndex(int index, int element) {
		// TODO Auto-generated method stub
		if(index < 0 || index > count){
			throw new ArrayIndexOutOfBoundsException("Invalid index");
		}
		Node n1 = new Node(element);
		Node n = head;
		int i = 0;
		if(head == null){ //if the list is empty
			head = n1;
			end = n1;
			count++;
			return;
		}
		while(i != index){
			
			if(i == count-1){ // if element to be inserted at last then n.next should not be done as it goes to null
				break;
			}
			n = n.next;
			i++;
		}
		if(n == head){ // element inserted at 1st position
			n.previous = n1;
			n1.next = n;
			head = n1;
			count++;
			return;
		}
		if(i == count-1){ //element inserted at last position
			n.next = n1;
			n1.previous = n;
			count++;
			return;
		}
		n.previous.next = n1;
		n1.previous = n.previous;
		n1.next = n;
		n.previous = n1;
		count++;
	}
	public void reversePrint() {
		// TODO Auto-generated method stub
		if(head == null){
			throw new ArrayIndexOutOfBoundsException("Underflow");
		}
		Node temp = head;
		while(temp.next != null){
			temp = temp.next;
		}
		while(temp.previous != null){
			System.out.println(temp.data);
			temp = temp.previous;
		}
		System.out.println(temp.data);
		
	}
}
