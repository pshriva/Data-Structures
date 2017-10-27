package one;

public class StackData {
	int start;
	int capacity;
	int size = 0;
	int pointer;
	public StackData(int start, int capacity){
		this.start = start;
		this.capacity = capacity;
		pointer = start -1;
	}
}
