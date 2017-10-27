package reverseLinkedListUsingRecursion;

public class Main {
	public static void main(String args[]){
		LinkedList list = new LinkedList();
		list.add(5);
		list.add(4);
		list.add(12);
		list.add(13);
		list.display();
		list.reverseUsingRecursion(null, list.head, null);
		list.display();
	}
}
