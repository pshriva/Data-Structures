package seven;

public class LinkList {
	Node start;
	Node end;
	public LinkList(){
		start = null;
		end = null;
	}
	static class Node{
		int data;
		Node link;
		public Node(int element, Node next){
			data = element;
			link = next;
		}
	}
	public static void main(String args[]){
		LinkList llist = new LinkList();
		llist.add(1);
		llist.add(2);
		llist.add(3);
		llist.add(4);
		llist.add(20);
		llist.add(5);
		llist.add(6);
		llist.add(7);
		llist.add(8);
		llist.display();
		boolean isPalindrome = llist.getPalindromeStatus();
	}
	boolean getPalindromeStatus() {
		// TODO Auto-generated method stub
		Node slowRunner = start;
		Node fastRunner = start;
		while(fastRunner != null && fastRunner.link.link != null){
			slowRunner = slowRunner.link;
			fastRunner = fastRunner.link.link;
		}
		System.out.println("After the loop");
		System.out.println("SLowrunner " + slowRunner.data);
		System.out.println("fastrunner " + fastRunner.data);
		return false;
	}
	void display() {
		// TODO Auto-generated method stub
		Node temp = start;
		while(temp != null){
			System.out.print(temp.data + " ");
			temp = temp.link;
		}
		System.out.println();
	}
	void add(int element) {
		// TODO Auto-generated method stub
		Node newNode = new Node(element,null);
		if(start == null){
			start = newNode;
			end = newNode;
		}else{
			end.link = newNode;
			end = newNode;
		}
	}
}
