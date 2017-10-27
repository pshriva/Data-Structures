package ListOfDepths;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// we have takaen a binarySearch tree so that designing the insertion method becomes easier
public class Main {
	public static void main(String args[]){
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(70);
		bst.insert(50);
		bst.insert(90);
		bst.insert(80);
		bst.insert(95);
		bst.insert(45);
		bst.insert(60);
		bst.insert(55);
		bst.insert(65);
		bst.insert(53);
		bst.getBFS();
		List<LinkedList> list = bst.getList();
		for(LinkedList l : list){
			System.out.println("Elements at different levels are ");
			Iterator<Node> it = l.iterator();
			while(it.hasNext()){
				System.out.println(it.next().data);
			}
		}
	}
}
