package one;
// O[n^2] and in place
public class LinkedList {
	Node first;
	Node end;
	boolean isEmpty; // an integer 'size' could also be kept and incremented by 1 each time add() is called to maintaint the size of the linked list
	public LinkedList(){
		first = null;
		end = null;
		isEmpty = true;
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
		llist.add(2);
		llist.add(3);
		llist.add(6);
		llist.add(43);
		llist.add(2);
		llist.add(3);
		llist.add(9);
		llist.add(2);
		llist.add(43);
		llist.display();
		//removing duplicates
		llist.removeDuplicates();
		System.out.println("After removing duplicates ");
		llist.display();
		
	}
	/*void removeDuplicates(){ // the code commented below also works the same, only with more calculations but same time complexity
		Node current = first;
		while(current!= null){
			Node runner = current;
			while(runner.link != null){
				if(runner.link.data == current.data){
					runner.link = runner.link.link;
				}else{
					runner = runner.link;
				}
			}
			current = current.link;
		}
		
	}*/
	void removeDuplicates() {
		// TODO Auto-generated method stub
		if(isEmpty == false){
			int count = 1;
			Node temp = first;
			temp = first;
			while(temp != null){ //comparing each element with all other elements in the linked list and removing the 2nd occurance
				Node temp1 = temp.link;
				Node previous = temp;
				while(temp1 != null){
					if(temp.data == temp1.data){
						previous.link = temp1.link;
						temp1 = temp1.link;
					}
					else{
						previous = temp1;
						temp1 = temp1.link;
					}
				}
				temp = temp.link;
			}
		}else{
			System.out.println("There are no elements in linked list");
		}
	}
	void add(int element) {
		// TODO Auto-generated method stub
		Node newNode = new Node(element,null);
		isEmpty = false;
		if(first == null){
			first = newNode;
			end = newNode;
		}else{
			end.link = newNode;
			end = newNode;
		}
	}
	void display(){
		Node temp = first;
		while(temp.link != null){
			System.out.print(temp.data + " ");
			temp = temp.link;
		}
		System.out.println(temp.data);
	}
}
