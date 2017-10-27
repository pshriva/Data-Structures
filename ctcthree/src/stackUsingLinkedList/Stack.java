package stackUsingLinkedList;

public class Stack {
	LinkedList list;
	public Stack(){
		list = new LinkedList();
	}
	public void push(int element) {
		// TODO Auto-generated method stub
		list.add(element);
	}
	public int peek() {
		// TODO Auto-generated method stub
		if (list.top == null){
			throw new ArrayIndexOutOfBoundsException("Stack is empty");
		}
		return list.top.data;
	}
	
}
