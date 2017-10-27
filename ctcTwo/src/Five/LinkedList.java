// SC O[1] TC: O[n]

package Five;

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
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		LinkedList l3 = new LinkedList();
		l1.add(9);
		l1.add(9);
		l1.add(9);
		l1.add(9);
		l2.add(9);
		l2.add(9);
		l2.add(9);
		l2.add(9);
		l3.addNumbers(l1,l2);
		System.out.println("Elements after addition are ");
		Node n = l3.start;
		while(n != null){
			System.out.print(n.data + " ");
			n=n.link;
		}
	}
	void addNumbers(LinkedList l1, LinkedList l2) {
		// TODO Auto-generated method stub
		System.out.println("Inside add elements");
		int sum = 0;
		int carry = 0;
		Node temp1 = l1.start;
		Node temp2 = l2.start;
		while(temp1 != null || temp2 != null){
			int value = 0;
			if(temp1 != null){
				value += temp1.data;
				temp1 = temp1.link;
			}
			if(temp2 != null){
				value += temp2.data;
				temp2 = temp2.link;
			}
			sum = value + carry;
			carry = (sum - sum%10)/10;
			addToEnd(sum%10);
		}
		if(carry !=0){
			addToEnd(carry);
		}
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
		System.out.println("Adding element " + element);
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

