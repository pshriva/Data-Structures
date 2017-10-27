package reverseLinkedListUsingStack;

public class Main {
	public static void main(String args[]){
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(12);
		list.add(21);
		list.add(34);
		list.add(9);
		list.display();
		list.reverse();
		System.out.println("Elements after reversal are ");
		list.display();
		
	}
}
