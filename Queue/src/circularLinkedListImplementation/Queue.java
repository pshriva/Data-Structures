package circularLinkedListImplementation;

public class Queue {
	int arr[];
	int front;
	int rear;
	int size;
	public Queue(int size){
		this.size = size;
		arr = new int[size];
		front = -1;
		rear = -1;
	}
	public void push(int element) {
		// TODO Auto-generated method stub
		if(front == -1){
			front++;
			arr[front] = element;
			rear = front;
			return;
		}
		if((rear+1)%size !=  front){
			rear = (rear + 1)%size;
			arr[rear] = element;
			return;
		}
		throw new ArrayIndexOutOfBoundsException("Queue is full");
	}
	public int pop() {
		// TODO Auto-generated method stub
		int element;
		if(!isEmpty() && front != rear){
			element = arr[front];
			front = (front+1)%size;
			return element;
		}if(front == rear){
			element = arr[front];
			front = rear = -1;
			return element;
		}
		throw new ArrayIndexOutOfBoundsException("Queue is empty");
	}
	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return (front == -1 || front == rear);
	}
}
