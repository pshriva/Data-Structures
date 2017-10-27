//TC = O[n] and so is SC, therefore, out of place

package one;

import java.util.ArrayList;
import java.util.Hashtable;

import one.LinkedList.Node;

public class LinkedListOutOfPlace {
	Node first;
	Node end;
	boolean isEmpty; // an integer 'size' could also be kept and incremented by 1 each time add() is called to maintaint the size of the linked list
	public LinkedListOutOfPlace(){
		first = null;
		end = null;
		isEmpty = true;
	}
	static class Node{
		int data;
		Node link;
		public Node(int element, Node next){
			data = element;
			link = next;
		}
	}
	public static void main(String args[]){
		LinkedListOutOfPlace llist = new LinkedListOutOfPlace();
		llist.add(2);
		llist.add(3);
		llist.add(6);
		llist.add(43);
		llist.add(2);
		llist.add(3);
		llist.add(9);
		llist.add(2);
		llist.add(43);
		llist.display();
		//removing duplicates
		llist.removeDuplicates();
		System.out.println("After removing duplicates ");
		llist.display();
		
	}
	void removeDuplicates() {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<Integer>();
		Node temp = first;
		Node previous = null;
		while(temp != null){
			if(a.contains(temp.data)){
				previous.link = temp.link;
			}else{
				a.add(temp.data);
				previous = temp;
			}
			temp = temp.link;
		}
	}
	void add(int element) {
		// TODO Auto-generated method stub
		Node newNode = new Node(element,null);
		isEmpty = false;
		if(first == null){
			first = newNode;
			end = newNode;
		}else{
			end.link = newNode;
			end = newNode;
		}
	}
	void display(){
		Node temp = first;
		while(temp.link != null){
			System.out.print(temp.data + " ");
			temp = temp.link;
		}
		System.out.println(temp.data);
	}
}
