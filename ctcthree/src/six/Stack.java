package six;

public class Stack {
	int stack[];
	int capacity;
	int top;
	public Stack(int capacity){
		this.capacity = capacity;
		top = -1;
		stack = new int[capacity];
	}
	public void push(int element) {
		// TODO Auto-generated method stub
		if(top >= capacity){
			throw new ArrayIndexOutOfBoundsException("Array is full");
		}
		top++;
		stack[top]=element;
	}
	public int pop() {
		// TODO Auto-generated method stub
		if(top == -1){
			throw new ArrayIndexOutOfBoundsException("Stack underflow");
		}
		int element = stack[top];
		top--;
		return element;
	}
	public void sort() {
		// TODO Auto-generated method stub
		Stack s = new Stack(capacity);
		while(top != -1){
			sortAscending(s);
		}
	}
	private void sortAscending(Stack s) {
		// TODO Auto-generated method stub
		int element = pop();
		if(s.top == -1){
			s.top++;
		}
	}
	
}
