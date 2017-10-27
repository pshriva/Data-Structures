package ctcthree;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Stack {
	int arr[];
	int top,len,size;
	public Stack(int n){
		top = -1;
		len = 0;
		size = n;
		arr = new int[size];
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Stack s = new Stack(1);
		char choice;
		do{
			System.out.println("Choose the stack operation");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Peek");
			int ch = sc.nextInt();
			int element;
			switch(ch){
			case 1:
				System.out.println("Enter the element");
				s.push(sc.nextInt());
				break;
			case 2:
				element = s.pop();
				System.out.println("Element " + element + " is removed from stack");
				break;
			case 3:
				element = s.peek();
				System.out.println("Element at the top of stack is " + element);
			}
			System.out.println("Do you want to continue (Y/N) ");
			choice = sc.next().charAt(0);
		}while(choice == 'y' || choice == 'Y');
	}
	int peek() {
		// TODO Auto-generated method stub
		if(top >= 0)
		return arr[top];
		throw new NoSuchElementException("Stack underflow");
	}
	int pop() {
		// TODO Auto-generated method stub
		if(top < 0){
			throw new NoSuchElementException("Underflow exception");
		}
		len--;
		return arr[top--];
	}
	void push(int element) {
		// TODO Auto-generated method stub
		if(top + 1 >= size){
			throw new IndexOutOfBoundsException("Overflow Exception");
			//System.out.println("Index is out of bound");
		}
		arr[++top] = element;
		len++;
	}
}
