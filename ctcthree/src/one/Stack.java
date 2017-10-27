//This is a solution for part one <fixed division>
package one;

import java.util.NoSuchElementException;

public class Stack {
	int stackSize;
	int[] stack;
	int[] stackPointer = {-1,-1,-1};
	public Stack(int size){
		stackSize = size;
		stack = new int[stackSize * 3];
	}
	public static void main(String args[]){
		Stack stack = new Stack(100);
		stack.push(1, 15);
		int element = stack.pop(1);
		System.out.println("Element popped is " + element);
		stack.push(2, 15);
		element = stack.pop(1);
		System.out.println("Element popped is " + element);
		stack.push(1, 15);
		element = stack.pop(1);
		System.out.println("Element popped is " + element);
	}
	int pop(int stackNumber) {
		// TODO Auto-generated method stub
		if(stackPointer[stackNumber -1] == -1){
			throw new NoSuchElementException("Stack Underflow");
		}
		
		return(stack[stackPointer[stackNumber -1]--]);
	}
	void push(int stackNumber, int element) {
		// TODO Auto-generated method stub
		if(stackPointer[stackNumber-1] >= stackSize){
			throw new IndexOutOfBoundsException("Stack Overflow");
		}
		stack[++stackPointer[stackNumber - 1]] = element;
		System.out.println("Number of elements in " + stackNumber + " stack is " + (stackPointer[stackNumber-1]+1));
	}
}