package BSTSequences;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class TreeNode {
	Node root;
	public TreeNode(){
		root = null;
	}
	ArrayList<LinkedList<Integer>> allSequences(){
		return allSequences(root);
	}
	ArrayList<LinkedList<Integer>> allSequences(Node root) {
	    ArrayList<LinkedList<Integer>> result = new ArrayList<LinkedList<Integer>>();

	    if (root == null){
	        result.add(new LinkedList<Integer>());
	        return result;
	    }
	    LinkedList<Integer> prefix = new LinkedList<Integer>();
	    prefix.add(root.data);

	    ArrayList<LinkedList<Integer>> leftSeq = allSequences(root.left);
	    ArrayList<LinkedList<Integer>> rightSeq = allSequences(root.right);
	    System.out.println("Value of root is " + root.data);
	    // weave
	    for (LinkedList<Integer> left : leftSeq) {
	        for (LinkedList<Integer> right : rightSeq) {
	        	ArrayList<LinkedList<Integer>> weaved = new ArrayList<LinkedList<Integer>>();
	            weaveLists(left, right, weaved, prefix, root);
	        	result.addAll(weaved);
	        }
	    }
	    return result;
	}

	void weaveLists(LinkedList<Integer> first, LinkedList<Integer> second,
	    ArrayList<LinkedList<Integer>> results, LinkedList<Integer> prefix, Node root) {
	    // one list is empty. Add remainder to [a cloned] prefix and store result.
	    if (first.size() == 0 || second.size() == 0){
	        LinkedList<Integer> result = (LinkedList<Integer>) prefix.clone();
	        result.addAll(first);
	        result.addAll(second);
	        results.add(result);
	        return ;
	    }
	    System.out.println("Inside weavelist for root " + root.data);
	    // Recurse with head of first added to the prefix. Removing the head will
	    // damage first, so we'll need to put it back where we found it afterwards.
	    int headFirst = first.removeFirst();
	    prefix.addLast(headFirst);
	    weaveLists(first, second, results, prefix, root);
	    prefix.removeLast();
	    first.addFirst(headFirst);

	    // Do the same thing with second, damaging and then restoring the list
	    int headSecond = second.removeFirst();
	    prefix.addLast(headSecond);
	    weaveLists(first, second, results, prefix, root);
	    prefix.removeLast();
	    second.addFirst(headSecond);
	}
}
