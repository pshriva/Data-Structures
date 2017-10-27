package circularLinkedListImplementation;

public class Main {
	public static void main(String args[]){
		Queue queue = new Queue(10);
		// Test case for circular queue
//		for(int i = 0; i<10;i++){
//			queue.push(i);
//		}
//		System.out.println("Rear is " + queue.rear);
//		for(int i = 0; i<queue.size - 1; i++){
//			System.out.println(queue.pop());
//		}
//		System.out.println("Front is " + queue.front);
//		queue.push(9);
//		queue.push(12);
//		queue.push(123);
//		queue.push(12);
//		queue.push(1);
//		System.out.println("Rear is " + queue.rear);
//		queue.pop();
//		System.out.println("Front is " + queue.front);
		
		// Normal test case
		for(int i = 0; i<queue.size;i++){
			queue.push(i);
		}
		for(int i = 0;i<queue.size;i++){
			queue.pop();
		}
		System.out.println("Front is " + queue.front );
		System.out.println("Rear is " + queue.rear);
	}
}
