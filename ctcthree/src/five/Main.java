package five;

public class Main {
	public static void main(String args[]){
		int capacity = 5;
		MyQueue queue = new MyQueue(capacity);
		int element;
		for(int i = 0; i<5;i++){
			queue.push(i);
			System.out.println("Element pushed " + i);
		}
		for(int i = 0; i<5 ; i++){
			System.out.println("Element popped " + queue.pop());
		}
		for(int i = 0; i<5;i++){
			queue.push(i);
			System.out.println("Element pushed " + i);
		}
		for(int i = 0; i<5 ; i++){
			System.out.println("Element popped " + queue.pop());
		}
	}
}
