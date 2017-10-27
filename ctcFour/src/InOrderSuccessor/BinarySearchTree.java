package InOrderSuccessor;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
	Node root;
	public BinarySearchTree(){
		root = null;
	}
	public void insert(int val) {
		// TODO Auto-generated method stub
		root = insert(root, val);
	}
	private Node insert(Node root, int val) {
		// TODO Auto-generated method stub
		if(root == null){
			return new Node(val);
		}
		if(val<=root.data){root.left = insert(root.left, val);}
		if(val > root.data){root.right = insert(root.right, val);}
		return root;
	}
	public Node getSuccessor(Node node) {
		// TODO Auto-generated method stub
		if(node == null){
			return null;
		}
		if(node.right != null){
			return getLeastElementInRight(node.right);
		}
		Node parent = root;
		Node ancestor = null;
		while(node != parent){
			if(node.data == parent.data){
				return parent;
			}
			if(node.data < parent.data){
				ancestor = parent;
				parent = parent.left;
			}else{
				parent = parent.right;
			}
		}
		return ancestor;
	}
	private Node getLeastElementInRight(Node root) {
		// TODO Auto-generated method stub
		if(root.left == null){
			return root;
		}
		return getLeastElementInRight(root.left);
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
			System.out.println("Displaying elements at different levels");
			for(int i = 0; i< size; i++){
				Node n = queue.poll();
				System.out.println(n.data);
				if(n.left != null){
					queue.add(n.left);
				}if(n.right != null){
					queue.add(n.right);
				}
			}
		}
	}
}
