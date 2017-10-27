//in place and O[n] TC
package two;

import java.util.Scanner;

public class LListRecursiveA {
	Node start;
	Node end;
	public LListRecursiveA(){
		start = null;
		end = null;
	}
	static class Node{
		int data;
		Node link;
		public Node(int element,Node next){
			data = element;
			link = next;
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		LListRecursiveA llist = new LListRecursiveA();
		llist.add(2);
		llist.add(3);
		llist.add(6);
		llist.add(43);
		llist.add(2);
		llist.add(3);
		llist.add(9);
		llist.add(2);
		llist.add(64);
		System.out.println("Linked List elements are");
		llist.display();
		System.out.println("Enter the element index to display from last");
		int k = sc.nextInt();
		Node temp = llist.start;
		int element = llist.getElement(temp,k);
		/* Since this is a recursive approach, it finds the element somewhere between the stack, so it cannot return the kth value but can only print it*/
	}
	private int getElement(Node temp, int k) {
		// TODO Auto-generated method stub
		if(temp == null){
			return 0;
		}
		int i = getElement(temp.link,k) + 1;
			if(i == k){
				System.out.println(k + "th element from last is " + temp.data);
			}
		return i;
	}
	void add(int element) {
		// TODO Auto-generated method stub
		Node newNode = new Node(element,null);
		if(start == null){
			start = newNode;
			end = newNode;
		}else{
			end.link = newNode;
			end = newNode;
		}
	}
	void display(){
		Node temp = start;
		while(temp != null){
			System.out.print(temp.data + " ");
			temp = temp.link;
		}
		System.out.println();
	}
}
