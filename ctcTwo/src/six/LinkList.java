// This is the actual solution to the problem
package six;

import six.LinkedList.Node;

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
		public Node(int element, Node next){
			data = element;
			link = next;
		}
	}
	public static void main(String args[]){
		LinkList llist = new LinkList();
		llist.add(7);
		llist.add(3);
		llist.add(2);
		llist.add(4);
		llist.add(9);
		llist.add(1);
		llist.add(8);
		llist.display();
		llist.createLoop();
		Node loopPoint = llist.getLoop();
		if(loopPoint == null){
			System.out.println("LinkedList is not looped");
		}else{
			System.out.println("LinkedList is looped at " + loopPoint.data);
		}
	}
	Node getLoop() {
		// TODO Auto-generated method stub
		Node slowRunner = start;
		Node fastRunner = start;
		while(true){
			slowRunner = slowRunner.link;
			if(fastRunner.link != null){
				fastRunner = fastRunner.link.link;
			}else{
				return null;
			}
			if(slowRunner == null || fastRunner == null){
				return null;
			}
			if(slowRunner == fastRunner){
				break;
			}
		}
		slowRunner = start;
		while(true){
			if(slowRunner == fastRunner){
				return slowRunner;
			}
			slowRunner = slowRunner.link;
			fastRunner = fastRunner.link;
		}
	}
	void createLoop() {
		// TODO Auto-generated method stub
		Node temp = start;
		while(temp.link != null){
			temp = temp.link;
		}
		temp.link = start.link.link.link;
	}
	void display() {
		// TODO Auto-generated method stub
		Node temp = start;
		while(temp != null){
			System.out.print(temp.data + " ");
			temp = temp.link;
		}
		System.out.println();
	}
	void add(int element) {
		// TODO Auto-generated method stub
		Node newNode = new Node(element, null);
		if(start == null){
			start = newNode;
			end = newNode;
		}else{
			end.link = newNode;
			end = newNode;
		}
	}
}
