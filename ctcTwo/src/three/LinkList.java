package three;

import java.util.Scanner;
public class LinkList {
	Node start;
	Node end;
	public LinkList(){
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
		LinkList llist = new LinkList();
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
		System.out.println("Enter the index of the element to be deleted");
		int index = sc.nextInt();
		Node n = llist.start;
		for(int i =1;i<index;i++){
			n=n.link;
		}
		System.out.println("The element to be deleted is  " + n.data);
		llist.deleteElement(n);
		System.out.println("Elements after deletions are ");
		llist.display();

	}
	
	void deleteElement(Node n) {
		// TODO Auto-generated method stub
		//last element cannot be deleted using this method
			n.data =n.link.data;
			n.link = n.link.link;
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

