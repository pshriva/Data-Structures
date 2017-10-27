package six;

public class Main {
	public static void main(String args[]){
		Stack s = new Stack(5);
		s.push(12);
		s.push(32);
		s.push(0);
		s.push(4);
		s.push(5);
		s.sort();
		while(s.top != -1){
			System.out.println(s.pop());
		}
	}
}
