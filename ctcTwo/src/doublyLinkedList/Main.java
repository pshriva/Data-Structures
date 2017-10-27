package doublyLinkedList;

public class Main {
	public static void main(String args[]){
		LinkedList list = new LinkedList();
//		list.add(10);
//		list.add(21);
//		list.add(0);
//		list.display();
//		list.delete(2);
//		System.out.println("Elements after deleting element at index 9");
//		list.display();
//		list.insertAtIndex(0, 23); // this function can also be broken down into 3 functions 1. add at head, 2. add at tail, 3. add at any other index
//		list.insertAtIndex(0, 24);
//		list.display();
		list.insertAtIndex(0, 100);
		list.insertAtIndex(0, 12);
		System.out.println("Elements after adding 1 element at index 4");
	    list.display();
	    System.out.println("Elements in reverse order are ");
	    list.reversePrint();
	}
}
