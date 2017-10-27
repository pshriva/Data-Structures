package ArrayImplementationOfQueue;

public class Main {
	public static void main(String args[]){
		Queue queue = new Queue(10);
		for(int i = 0 ; i <10;i++){
			queue.push(i);
		}
		queue.push(10);
		for(int i = 0 ; i<10; i++){
			System.out.println(queue.pop());
		}
	}
}
