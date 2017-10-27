package five;

public class MyQueue {
	Stack s1;
	Stack s2;
	public MyQueue(int capacity){
		s1 = new Stack(capacity);
		s2 = new Stack(capacity);
	}
	public void push(int element) {
		// TODO Auto-generated method stub
		if(s2.top> -1){
			while(s2.top != -1){
				s1.push(s2.pop());
			}
		}
		s1.push(element);
	}
	public int pop() {
		// TODO Auto-generated method stub
		int element1;
		if(s2.top== -1){
			while(s1.top != -1){
				s2.push(s1.pop());
			}
		}
	    int element = s2.pop();
		return element;
	}
}
