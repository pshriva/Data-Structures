//SC = O[n/2] or O[n] TC = O[n]
// but this solution requires to use one more method addAtBeginning() to be called inside our algotirhm mehtod
//getPalindromeStatus(). This is solved in the next solution using Stack
package seven;

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
		llist.add(4);
		llist.add(3);
		llist.add(2);
		llist.add(1);
		llist.add(13);
		llist.add(1);
		llist.add(2);
		llist.add(3);
        llist.add(4);
		llist.display();
		boolean isPalindrome = llist.getPalindromeStatus();
		if(isPalindrome == true){
			System.out.println("The linkedlist is palindrome");
		}else{
			System.out.println("LinkedList is not palindrome");
		}
	}
	boolean getPalindromeStatus() {
		// TODO Auto-generated method stub
		if(start == null){
			return false;
		}
		Node temp = start;
		int size = 0;
		LinkedList tempList = new LinkedList();
		while(temp != null){
			size++;
			temp = temp.link;
		}
		temp = start;
		for(int i=0; i<size/2; i++){
				tempList.addAtBeginning(temp.data);
				temp = temp.link;
		}
		tempList.display();
		Node temp1 = tempList.start;
		for(int i = size/2; i<size; i++){
			if(size%2 != 0 && i == size/2){ // checking if size of linkedlist is even or odd
				temp = temp.link;
			}
			if(temp.data != temp1.data){
				return false;
			}
		}
		return true;
	}
	void addAtBeginning(int data) {
		// TODO Auto-generated method stub
		Node newNode = new Node(data,null);
		if(start == null){
			start = newNode;
		}else{
			Node temp = start;
			start = newNode;
			start.link = temp;
		}
	}
	void display() {
		// TODO Auto-generated method stub
		Node temp = start;
		while(temp != null){
			System.out.print(temp.data + " ");
			temp = temp.link;
		}
		System.out.println(" ");
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
