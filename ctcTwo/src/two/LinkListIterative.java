package two;

import java.util.Scanner;
public class LinkListIterative {
	Node start;
	Node end;
	public LinkListIterative(){
		start = null;
		end = null;
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
		Scanner sc = new Scanner(System.in);
		LinkListIterative llist = new LinkListIterative();
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
		System.out.println(k + "th element from end is " + element);
		}
	private int getElement(Node temp, int k) {
		// TODO Auto-generated method stub
		Node p1 = start;
		for(int i = 0; i<k;i++){
			p1 = p1.link;
		}
		Node p2 = start;
		while(p1!=null){
			p1 = p1.link;
			p2 = p2.link;
		}
		return p2.data;
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
