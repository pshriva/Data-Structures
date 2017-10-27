package two;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Stack {
	int arr[];
	int size;
	int top;
	int min[];
	int minTop;
	public Stack(int n){
		size = n;
		top = -1;
		minTop = -1;
		arr = new int[size];
		min = new int[size];
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Stack stack = new Stack(6);
		char choice;
		do{
			int ch, element;
			System.out.println("Enter your choice");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Peek");
			System.out.println("4. Find minimum");
			ch = sc.nextInt();
			switch (ch){
			case 1:
				System.out.println("Enter the element");
				element = sc.nextInt();
				stack.push(element);
				break;
			case 2:
				element = stack.pop();
				System.out.println("Element " + element + " is removed from stack");
				break;
			case 3:
				element = stack.peek();
				System.out.println("Element at the top of the stack is " + element);
				break;
			case 4:
				element = stack.min();
				System.out.println("The minimum element in the stack is " + element);
				break;
			default:
				System.out.println("Wrong choice");
			}
			System.out.println("Do you want to continue (Y/N)");
			choice = sc.next().charAt(0);
		}while(choice == 'Y' || choice == 'y');
	}
	private int min() {
		// TODO Auto-generated method stub
		if(minTop == -1){
			throw new NoSuchElementException("Stack Underflow");
		}
		return min[minTop];
	}
	private int peek() {
		// TODO Auto-generated method stub
		if(top == -1){
			throw new NoSuchElementException("Stack Underflow");
		}
		return arr[top];
	}
	private int pop() {
		// TODO Auto-generated method stub
		if(top == -1){
			throw new NoSuchElementException("Stack Underflow");
		}
		int element = arr[top];
		if(element == min[minTop]){
			minTop--;
		}
		return arr[top--];
	}
	private void push(int element) {
		// TODO Auto-generated method stub
		if(top + 1 >= size){
			throw new IndexOutOfBoundsException("Stack Overflow");
		}
		if(minTop == -1 || min[minTop] > element){
			min[++minTop] = element;
		}
		arr[++top] = element;
	}
}
