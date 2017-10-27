// SC O[n] TC: O[n]
package Five;

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
		LinkList l1 = new LinkList();
		LinkList l2 = new LinkList();
		LinkList l3 = new LinkList();
		//l1.add(9);
		l1.add(9);
		l1.add(9);
		l2.add(9);
		l2.add(9);
		l2.add(9);
		Node n = l3.addNumbers(l1.start, l2.start, 0);
		System.out.println("Elements after addition are ");
		l3.display();
	}
	Node addNumbers(Node n1, Node n2, int carry) {
		System.out.println("ADD NUMEBRS IS CALLED HERE");
		// TODO Auto-generated method stub
		if(n1 == null && n2 == null  && carry == 0){
			return null;
		}
		int value = carry;
		int sum = 0;
		if(n1 != null){
			value += n1.data;
		}
		if(n2 != null){
			value += n2.data;
		}
		sum = value;
		addToEnd(sum%10);
		Node n = new Node();
		while(n1 != null || n2 != null){
			System.out.println("Inside while loop");
			if(n != null)
			n = addNumbers(n1==null?null:n1.link,n2==null?null:n2.link,value>9?1:0);
			if(n1 !=null)
			n1 = n1.link;
			if(n2 != null)
			n2 = n2.link;
		}
		return null;
	}
	void addToEnd(int element) {
		// TODO Auto-generated method stub
		Node newNode = new Node(element,null);
		if(start == null){
			start = newNode;
		}else{
			Node temp = start;
			start = newNode;
			start.link = temp;
		}
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

