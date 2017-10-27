package three;

public class Main {
	public static void main(String args[]) throws Exception{
		SetOfStacks set = new SetOfStacks();
		for (int i = 0; i < 10; i++) {
			set.push(i);
		}
	/*	for (int i = 0; i < 10; i++) {
			System.out.println("Popped " + set.pop());
		}	*/
		int element  = set.pop(1);
	    System.out.println(element);
	}
}
