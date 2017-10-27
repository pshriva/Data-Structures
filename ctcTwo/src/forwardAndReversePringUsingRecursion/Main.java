package forwardAndReversePringUsingRecursion;

public class Main {
	public static void main(String args[]){
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(11);
		list.add(12);
		System.out.println("Elements in forward order are: ");
		list.display(list.head);
		System.out.println("Elements in reverse are: ");
		list.displayInReverse(list.head);
	}
}
