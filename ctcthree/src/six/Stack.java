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
	public int peek(){
		if(top != -1){return stack[top];}
		throw new ArrayIndexOutOfBoundsException("Stack underflow");
	}
	public boolean isEmpty(){
		return top == -1;
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
	public Stack sort() {
		// TODO Auto-generated method stub
		Stack s  = new Stack(capacity);
		while(top != -1){
			int i = pop();
			while(!s.isEmpty() && s.peek() > i){
				push(s.pop());
			}
			s.push(i);
		}
		return s;
	}
	
}
