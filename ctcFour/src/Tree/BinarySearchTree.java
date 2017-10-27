package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
	Node root;
	public BinarySearchTree(){
		root = null;
	}
	public void insert(int data) {
		// TODO Auto-generated method stub
		root = insert(root, data);
	}
	private Node insert(Node root, int data) {
		// TODO Auto-generated method stub
		if(root == null){
			return new Node(data);
		}
		if(data <= root.data){
			root.left = insert(root.left, data);
		}else if(data > root.data){
			root.right = insert(root.right, data);
		}
		return root;
	}
	public void getBFS() {
		// TODO Auto-generated method stub
		if(root == null){
			System.out.println("Tree is empty");
			return;
		}
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while(queue.size() != 0){
			Node n = queue.remove();
			System.out.println(n.data);
			if(n.left != null){
				queue.add(n.left);
			}if(n.right != null){
				queue.add(n.right);
			}
		}
	}
}
