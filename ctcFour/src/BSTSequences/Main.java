package BSTSequences;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
	public static void main(String args[]){
		TreeNode t = new TreeNode();
		t.root = new Node(2);
		t.root.left = new Node(1);
		t.root.right = new Node(3);
		ArrayList<LinkedList<Integer>> list = t.allSequences();
		for(LinkedList l : list){
			System.out.println("Printing linked lists");
			Iterator it = l.iterator();
			while(it.hasNext()){
				System.out.println(it.next());
			}
		}
	}
}
