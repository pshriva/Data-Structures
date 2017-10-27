package four;

class Stack{
	int stack[];
	int top;
	int capacity;
	public Stack(int capacity){
		this.capacity = capacity;
		stack = new int[capacity];
		top = -1;
	}
	public void push(int element) throws Exception {
		// TODO Auto-generated method stub
		if(top >= capacity){
			throw new Exception("Tower  full");
		}
		top++;
		stack[top] = element;
		System.out.println("Element at the top of stack is " + stack[top]);
	}
	public int pop() throws Exception {
		// TODO Auto-generated method stub
		if(top == -1){
			throw new Exception("Tower is empty");
		}
		int element = stack[top];
		top--;
		return element;
	}
}