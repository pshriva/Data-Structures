package four;

public class Tower {
	Stack discs;
	int index;
	public Tower(int index, int capacity){
		discs = new Stack(capacity);
		this.index = index;
	}
	public void push(int element) throws Exception {
		// TODO Auto-generated method stub
		discs.push(element);
	//	System.out.println("Element " + element +" pushed to tower " + index);
	}
	public void moveDisks(int n, Tower source, Tower buffer, Tower destination) throws Exception {
		// TODO Auto-generated method stub
		if(n>0){
			moveDisks(n-1, source, destination, buffer);
			moveTop(destination);
			buffer.moveDisks(n-1, buffer, source, destination);
		}
	}
	private void moveTop(Tower destination) throws Exception {
		// TODO Auto-generated method stub
		int element = discs.pop();
		System.out.println("element popped is " + element);
		destination.push(element);
	}
	public int pop() throws Exception {
		// TODO Auto-generated method stub
		int element = discs.pop();
		return element;
	}
}
