package firstCommonAncestorNoGivenParentNode;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	Node root;
	public BinaryTree(){
		root = null;
	}
	public void getBFS() {
		// TODO Auto-generated method stub
		if(root == null){
			System.out.println("Tree is empty");
		}
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty()){
			int size = queue.size();
			System.out.println("Displaying nodes at each level");
			for(int i = 0; i<size; i++){
				Node n = queue.poll();
				System.out.println(n.data);
				if(n.left != null){
					queue.add(n.left);
				}
				if(n.right != null){
					queue.add(n.right);
				}
			}
		}
	}
	public Node getCommonAncestor(Node n1, Node n2) {
		// TODO Auto-generated method stub
		return getAncestor(root, n1, n2);
	}
	private Node getAncestor(Node root, Node n1, Node n2) {
		// TODO Auto-generated method stub
		if(root == null || root == n1 || root == n2){
			return root;
		}
		if(contains(root.left, n1) && contains(root.right, n2)){
			return getAncestor(root.left, n1, n2);
		}else if(contains(root.right, n1) && contains(root.right, n2)){
			return getAncestor(root.right, n1, n2);
		}else{
			return root;
		}
	}
	private boolean contains(Node root, Node n) {
		// TODO Auto-generated method stub
		if(root == null){
			return false;
		}if(root == n || contains(root.left, n) || contains(root.right, n)){
			return true;
		}
		return false;
	}
	
}
