package onePlusLinkedLIst;

public class LinkedList {
	Node start;
	public LinkedList(){
		start = null;
	}
	public void add(int val) {
		// TODO Auto-generated method stub
		if(start == null){
			start = new Node(val);
			return;
		}
		Node temp = start;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = new Node(val);
	}
	public void display() {
		// TODO Auto-generated method stub
		Node temp = start;
		while(temp != null){
			System.out.println(temp.val);
			temp = temp.next;
		}
	}
	public void plusOne() {
		// TODO Auto-generated method stub
		
	}
}
