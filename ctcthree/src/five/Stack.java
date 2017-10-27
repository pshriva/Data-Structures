package five;

public class Stack {
	int stack[];
	int capacity;
	int top;
	int size;
	public Stack(int capacity){
	this.capacity = capacity;
	stack = new int[capacity];
	top = -1;
	size = 0;
	}
	public void push(int element) {
		// TODO Auto-generated method stub
		if(top >= capacity){
			throw new ArrayIndexOutOfBoundsException("All full");
		}
		top++;
		size++;
		stack[top] = element;
	}
	public int pop() {
		// TODO Auto-generated method stub
		if(top == -1){
			throw new ArrayIndexOutOfBoundsException("All empty");
		}
		int element = stack[top];
		top--;
		size--;
		return element;
	}
}
