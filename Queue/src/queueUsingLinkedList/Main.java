package queueUsingLinkedList;

public class Main {
	public static void main(String args[]){
		Queue queue = new Queue();
		queue.push(11);
		queue.push(12);
		System.out.println(queue.front());
		System.out.println(queue.pop());
		System.out.println(queue.front());
	}
}
