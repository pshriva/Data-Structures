package forwardAndReversePringUsingRecursion;

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
	public void display(Node temp) {
		// TODO Auto-generated method stub
		if(temp != null){
			System.out.println(temp.data);
			display(temp.link);
		}
	}
	public void displayInReverse(Node temp) {
		// TODO Auto-generated method stub
		if(temp != null){
			displayInReverse(temp.link);
			System.out.println(temp.data);
		}
	}
}
