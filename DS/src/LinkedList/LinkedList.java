package LinkedList;

import java.util.Scanner;

public class LinkedList {
	Node start;
	public LinkedList(){
		start = null;
	}
	static class Node{
		int data;
		Node link;
		public Node(int element, Node l) {
			// TODO Auto-generated constructor stub
			data = element;
			link = null;
		}
		public void setLink(Node n) {
			// TODO Auto-generated method stub
			link = n;
			
		}
		
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		LinkedList llist = new LinkedList();
		char ch;
		do{
			System.out.println("\nSingly Linked List Operations\n");
            System.out.println("1. insert at begining");
            System.out.println("2. insert at end");
            System.out.println("3. insert at position");
            System.out.println("4. delete at position");
            System.out.println("5. Display linked list");
            int choice = sc.nextInt();  
            int element;
            int position;
            switch (choice){
            case 1:
            	System.out.println("Enter the element to be inserted: ");
            	element = sc.nextInt();
            	llist.insertAtBeginning(element);
            	break;
            case 2:
            	System.out.println("Enter the element to be inserted: ");
            	element = sc.nextInt();
            	llist.insertAtEnd(element);
            	break;
            case 3:
            	System.out.println("Enter the position for the new element");
            	position = sc.nextInt();
            	System.out.println("Enter the element to be inserted: ");
            	element = sc.nextInt();
            	llist.insertAtPosition(element,position);
            	break;
            case 4:
            	System.out.println("Enter the position of element to be deleted");
            	position = sc.nextInt();
            	llist.deleteAtPosition(position);
            	break;
            case 5:
            	llist.display();
            	break;
            }
			System.out.println("Do you want to continue? (Y/N)");
			ch = sc.next().charAt(0);
		}while(ch=='Y' || ch=='y');
	}

	void deleteAtPosition(int position) {
		// TODO Auto-generated method stub
		if(position == 1){
			start=start.link;
		}else{
			Node temp = start;
			for(int i=1;i<position-1;i++){
				temp = temp.link;
			}
			Node temp1=temp.link;
			temp1 = temp1.link;
			temp.link = temp1;
		}
	}

	void insertAtPosition(int element, int position) {
		// TODO Auto-generated method stub
		Node newNode = new Node(element,null);
		Node temp = start;
		if(position == 1){
			insertAtBeginning(element);
		}else{
			for(int i=0;i<position-2;i++){
				temp=temp.link;
			}
			Node temp1 = temp.link;
			temp.link = newNode;
			newNode.link = temp1;
		}
		
	}

	void display() {
		// TODO Auto-generated method stub
		Node temp = start;
		while(temp.link != null){
			System.out.println(temp.data);
			temp = temp.link;
		}		
		System.out.println(temp.data);
	}

	void insertAtBeginning(int element) {
		// TODO Auto-generated method stub
		Node newNode = new Node(element, null);
		if(start == null){
			start = newNode;
		}else{
			newNode.setLink(start);
			start = newNode;
		}
	}
	void insertAtEnd(int element){
		Node newNode = new Node(element,null);
		Node temp = start;
		while(temp.link != null){
			temp = temp.link;
		}
		temp.link = newNode;
	}
}
