//SC - O[n]
package Five;

import java.util.Scanner;
public class LinkedListFollowUp {
	Node start;
	Node end;
	public LinkedListFollowUp(){
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
		LinkedListFollowUp l1 = new LinkedListFollowUp();
		LinkedListFollowUp l2 = new LinkedListFollowUp();
		LinkedListFollowUp l11 = new LinkedListFollowUp();
		LinkedListFollowUp l22 = new LinkedListFollowUp();
		LinkedListFollowUp l3 = new LinkedListFollowUp();
		//l1.add(1);
		l1.add(2);
		l1.add(3);
		l2.add(4);
		l2.add(5);
		l2.add(6);
		System.out.println("L1 is : ");
		l1.display();
		System.out.println("L2 is : ");
		l2.display();
		l11.reverse(l1);
		l22.reverse(l2);
		System.out.println("After reversing ");
		System.out.println("L1 is ");
		l11.display();
		System.out.println("L2 is ");
		l22.display();
		l3.addNumbers(l11,l22);
		System.out.println("Elements after addition are ");
		l3.display();
	}
	private void reverse(LinkedListFollowUp lList) { //ALGORITHM
		// TODO Auto-generated method stub
		Node temp = lList.start;
		while(temp != null){
			addToEnd(temp.data);
			temp = temp.link;
		}
		
	}
	void addNumbers(LinkedListFollowUp l1, LinkedListFollowUp l2) {
		// TODO Auto-generated method stub
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

