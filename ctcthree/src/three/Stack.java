package three;

public class Stack {
	int size;
	int capacity;
	int top;
	int stack[];
	public Stack(){
		capacity = 4;
		top = -1;
		size = 0;
		stack = new int[capacity];
	}
	public boolean isFull() {
		// TODO Auto-generated method stub
		if(size >= capacity)
		   return true;
		else
			return false;
	}
	public void push(int element) {
		// TODO Auto-generated method stub
		if(isFull()){
			throw new ArrayIndexOutOfBoundsException("Stack Overflow");
		}else{
			top++;
			size++;
			stack[top] = element;
		}
	}
	public int pop() {
		// TODO Auto-generated method stub
		int element = stack[top];
		top--;
		size--;
		return element;
	}
}
