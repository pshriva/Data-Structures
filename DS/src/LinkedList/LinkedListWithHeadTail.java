package LinkedList;

import java.util.Scanner;

import LinkedList.LinkedList.Node;

public class LinkedListWithHeadTail {
	Node start;
	Node end;
	public LinkedListWithHeadTail(){
		start = null;
		end = null;
	}
	public static class Node{
		int data;
		Node link;
		public Node(int element, Node n){
			data = element;
			link = n;
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		LinkedListWithHeadTail llist = new LinkedListWithHeadTail();
		char ch;
		do{
			System.out.println("\nSingly Linked List Operations\n");
            System.out.println("1. insert at begining");
            System.out.println("2. insert at end");
            System.out.println("3. Display linked list");
            int choice = sc.nextInt();  
            int element;
            switch(choice){
            case 1:
            	System.out.println("Enter the element to be inserted: ");
            	element = sc.nextInt();
            	llist.insertAtBeginning(element);
            	break;
            case 2:
            	System.out.println("Enter the element to be inserted: ");
            	element = sc.nextInt();
            	llist.insertAtEnd(element);
            case 3:
            	llist.display();
            	break;
            default:
            	System.out.println("Wrong choice");
            	break;
            }
			System.out.println("Do you want to continue: (y/n) ");
			ch = sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
	}
	void insertAtEnd(int element) {
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
	void insertAtBeginning(int element) {
		// TODO Auto-generated method stub
		Node newNode = new Node(element,null);
		if(start==null){
			start = newNode;
			end = newNode;
		}else{
			newNode.link=start;
			start = newNode;
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
}
