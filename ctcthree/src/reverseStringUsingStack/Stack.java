package reverseStringUsingStack;

public class Stack {
	char arr[];
	int top;
	int capacity;
	public Stack(int capacity){
		this.capacity = capacity;
		arr = new char[capacity];
		top = -1;
	}
	public String reverse(String str) {
		// TODO Auto-generated method stub
		for(int i = 0; i<str.length();i++){
			push(str.charAt(i));
		}
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i<str.length();i++){
			sb.append(pop());
		}
		return sb.toString();
	}
	public char pop() {
		// TODO Auto-generated method stub
		char c = arr[top];
		top--;
		return c;
	}
	public void push(char c) {
		// TODO Auto-generated method stub
		top++;
		arr[top] = c;
	}
}
