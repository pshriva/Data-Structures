package one;

public class MainClass {
	static int numberOfStacks = 3;
	static int defaultSize = 4;
	static int totalSize = numberOfStacks * defaultSize;
	static StackData stacks[] = {new StackData(0,defaultSize), new StackData(defaultSize,defaultSize), new StackData(defaultSize*2, defaultSize)};
	static int buffer[] = new int[totalSize];
	public static void main(String args[]) throws Exception{
		push(1,21);
		push(0,11);
		push(0,12);
		push(0,13);
		push(0,14);
		push(2,31);
		push(2,32);
		push(2,33);
		push(2,34);
		peek(0);
		peek(1);
		peek(2);
		push(2,35);
		peek(0);
		peek(1);
		peek(2);
	}
	private static void peek(int stackNumber) {
		// TODO Auto-generated method stub
		StackData stack = stacks[stackNumber];
		System.out.println("The element at the top of stack " + stackNumber + " is " + buffer[stack.pointer]);
	}
	private static void push(int stackNumber, int value) throws Exception {
		// TODO Auto-generated method stub
		StackData stack = stacks[stackNumber];
		if(stack.size >= stack.capacity){
			if(numberOfElement() >= totalSize){
				throw new Exception("Out of Space");
			}else{
				expand(stackNumber);
			}
		}
		stack.size++;
		stack.pointer = nextElement(stack.pointer);
		buffer[stack.pointer] = value;
	}
	private static int nextElement(int index) {
		// TODO Auto-generated method stub
		if(index + 1 == totalSize){
			return 0;
		}else{
			return ++index;
		}
	}
	private static void expand(int stackNumber) {
		// TODO Auto-generated method stub
		System.out.println("Expanding stackNumber" + stackNumber);
		StackData stack = stacks[(stackNumber +1) % numberOfStacks];
		if(stack.size >= stack.capacity){
			expand((stackNumber + 1) % numberOfStacks);
			stack.capacity++;
		}
		int numberOfLoops = stack.size;
		int loopStartPoint = nextElement(stack.pointer); // loop has to be started from 1 + the position where last element sits in the stack
		for(int i = loopStartPoint; numberOfLoops>0; ){
			buffer[i] = buffer[getPreviousElement(i)];
			numberOfLoops--;
			i = getPreviousElement(i);
		}
		stack.start = nextElement(stack.start);
		stack.pointer = nextElement(stack.pointer);
		stack.capacity--;
	}
	private static int getPreviousElement(int index) {
		// TODO Auto-generated method stub
		if(index == 0){
			return totalSize - 1;
		}else{
			return index - 1;
		}
	}
	private static int numberOfElement() {
		// TODO Auto-generated method stub
		return stacks[0].size + stacks[1].size + stacks[2].size;
	}
}
