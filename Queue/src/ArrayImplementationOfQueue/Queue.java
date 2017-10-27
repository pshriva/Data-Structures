package ArrayImplementationOfQueue;

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
		if(isFull()){
			throw new ArrayIndexOutOfBoundsException("Queue is full");
		}
		if(front == -1){
			front++;
			arr[front] = element;
			rear = front;
			return;
		}
		rear++;
		arr[rear] = element;
	}
	private boolean isFull() {
		// TODO Auto-generated method stub
		return rear == size-1;
	}
	public int front() {
		// TODO Auto-generated method stub
		if(isEmpty()){
			throw new ArrayIndexOutOfBoundsException("Queue is empty");
		}
		return arr[front];
	}
	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return (front == -1 || front == size);
	}
	public int pop() {
		// TODO Auto-generated method stub
		if(isEmpty()){
			throw new ArrayIndexOutOfBoundsException("Queue is empty");
		}
		int element = arr[front];
		front++;
		return element;
	}
}
