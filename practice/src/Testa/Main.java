package Testa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	static class Node {
	      int val;
	     Node left;
	     Node right;
	    Node(int x) { val = x; }
	 }

public static void main(String args[]) throws IOException{
	Node root = new Node(30);
	root.left = new Node(8);
	root.right = new Node(52);
	root.left.left = new Node(3);
	root.left.right = new Node(20);
	root.left.right.left = new Node(10);
	root.left.right.right = new Node(29);
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	String line;
	Node n1 = null;
	Node n2 = null;
	while((line = in.readLine()) != null && line.length()!= 0){
		String[] l = line.split(" ");
		 n1 = new Node(Integer.parseInt(l[0]));
		 n2 = new Node(Integer.parseInt(l[2]));
		 Node lowestAncestor = getLowestAncestor(root, n1, n2);
			System.out.println(lowestAncestor.val);
	}
	
}

private static Node getLowestAncestor(Node root,Node p, Node q) {
	if(root.val > p.val && root.val > q.val){
        return getLowestAncestor(root.left, p, q);
    }else if(root.val < p.val && root.val < q.val){
        return getLowestAncestor(root.right, p, q);
    }else{
        return root;
    }
}
}
