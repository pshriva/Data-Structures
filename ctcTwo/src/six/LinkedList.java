// This program is not the solution for sixth problem, it just checks if the linked list is looped or not
// The next program is the solution for sixth problem
package six;

public class LinkedList {
	Node start;
	Node end;
	public LinkedList(){
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
		LinkedList llist = new LinkedList();
		llist.add(12);
		llist.add(13);
		llist.add(14);
		llist.add(15);
		llist.add(16);
		llist.add(17);
		llist.createLoop();
		//llist.display();	
		boolean isLoop = llist.getLoop();
		if(isLoop == true){
			System.out.println("The LinkedList is looped");
		}else{
			System.out.println("The LinkedList is not looped");
		}
	}
	void createLoop() {
		// TODO Auto-generated method stub
		Node temp = start;
		while(temp.link != null){
			temp = temp.link;
		}
		temp.link = start.link;
	}
	boolean getLoop() {
		// TODO Auto-generated method stub
		boolean isLoop = false;
		Node slowRunner = start;
		Node fastRunner = start;
		while(true){
			slowRunner = slowRunner.link;
			if(fastRunner.link != null){
				fastRunner = fastRunner.link.link;
			}else{
				return false;
			}
			if(slowRunner == null || fastRunner == null){
				return false;
			}
			if(slowRunner == fastRunner){
				return true;
			}
		}
	}
	/*	void display() {
		// TODO Auto-generated method stub
		Node temp = start;
		while(temp != null){
			System.out.print(temp.data + " ");
			temp = temp.link;
		}
	}*/
	void add(int element) {
		// TODO Auto-generated method stub
		Node newNode = new Node(element, null);
		if(start == null){
			start = newNode;
			end = newNode;
		}else{
			end.link = newNode;
			end = newNode;
		}
	}
}
