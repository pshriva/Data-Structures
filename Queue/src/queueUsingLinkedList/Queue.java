package queueUsingLinkedList;

public class Queue {
	Node front;
	Node rear;
	public Queue(){
		front = null;
		rear = null;
	}
	public void push(int element) {
		// TODO Auto-generated method stub
		Node n = new Node(element);
		if(front == null){
			front = n;
			rear = n;
			return;
		}
		rear.link = n;
		rear = n;
	}
	public int front() {
		// TODO Auto-generated method stub
		if(isEmpty()){
			throw new ArrayIndexOutOfBoundsException("Queue is empty");
		}
		return front.data;
	}
	public int pop() {
		// TODO Auto-generated method stub
		if(isEmpty()){
			throw new ArrayIndexOutOfBoundsException("Queue is empty");
		}
		int element = front.data;
		front = front.link;
		return element;
	}
	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return front==null;
	}
}
