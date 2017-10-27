package Four;

import java.util.Scanner;
public class LinkedList {
	Node start;
	Node end;
	public LinkedList(){
		start = null;
		end = null;
	}
	static class Node{
		int data;
		Node link;
		public Node(){
		}
		public Node(int element,Node next){
			data = element;
			link = next;
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		LinkedList llist = new LinkedList();
		llist.add(2);
		llist.add(3);
		llist.add(6);
		llist.add(43);
		llist.add(2);
		llist.add(3);
		llist.add(9);
		llist.add(2);
		llist.add(7);
		llist.add(43);
		System.out.println("Linked List elements are");
		llist.display(llist.start);
		System.out.println("Enter the element about which to sort the linkedlist ");
		int element = sc.nextInt();
		LinkedList llist2 = new LinkedList();
		Node n = llist.arrangeAboutElement(llist,element);
		System.out.println("Elements after rearranging are ");
		llist.display(n);

	}
	Node arrangeAboutElement(LinkedList llist, int element) {
		// TODO Auto-generated method stub
		LinkedList smaller = new LinkedList();
		LinkedList greater = new LinkedList();
		Node temp = start;
		while(temp != null){
			Node newNode = new Node(temp.data,null);
			if(newNode.data < element){
				//add to smaller
				if(smaller.start == null){
					smaller.start = newNode;
					smaller.end = newNode;
				}else{
					smaller.end.link = newNode;
					smaller.end = newNode;
				}
			}else{
				//add to greater
				if(newNode.data == element){
					Node temp1 = greater.start;
					greater.start = newNode;
					greater.start.link = temp1;
				}else{
					if(greater.start == null){
						greater.start = newNode;
						greater.end = newNode;
					}else{
						greater.end.link = newNode;
						greater.end = newNode;
					}
				}
			}
			temp = temp.link;
		}
		smaller.end.link = greater.start;
		return smaller.start;
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
	void display(Node n){
		Node temp = n;
		while(temp != null){
			System.out.print(temp.data + " ");
			temp = temp.link;
		}
		System.out.println();
	}
}

