//in place and O[n] TC
package two;

import java.util.Scanner;

public class LListIterative {
	Node start;
	Node end;
	public LListIterative(){
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
		LListIterative llist = new LListIterative();
		llist.add(2);
		llist.add(3);
		llist.add(6);
		llist.add(43);
		llist.add(2);
		llist.add(3);
		llist.add(9);
		llist.add(2);
		llist.add(43);
		System.out.println("Linked List elements are");
		llist.display();
		System.out.println("Enter the element index to display from last");
		int k = sc.nextInt();
		int element = llist.getElement(k);
		if(element == -1){
			System.out.println("Element does not exist");
		}else{
			System.out.println(k +"th element from last is " + element);
		}
	}
	private int getElement(int k) {
		// TODO Auto-generated method stub
		int size = 0;
		Node temp = start;
		while(temp != null){
			size++;
			temp = temp.link;
		}
		if(k<= 0 || k>size){
			return -1;
		}
		temp = start;
		for(int i = 0; i<size-k ; i++){
			temp = temp.link;
		}
		return temp.data;
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
