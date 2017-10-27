package BFSorLevelOrderTraversal;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
	Node root;
	public BinarySearchTree(){
		root = null;
	}
	public void insert(int i) {
		// TODO Auto-generated method stub
		root = insert(root, i);
	}
	private Node insert(Node root, int i) {
		// TODO Auto-generated method stub
		if(root == null){
			root = new Node(i);
		}else if(i<=root.data){
			root.left = insert(root.left, i);
		}else{
			root.right = insert(root.right,i);
		}
		return root;
	}
	public boolean search(int element) {
		// TODO Auto-generated method stub
		return search(root,element);
	}
	
	private boolean search(Node root, int i) {
		// TODO Auto-generated method stub
		System.out.println("searching for  " + i);
		if(root == null){
			return false;
		}
		if(root.data == i){
			System.out.println("Data found");
			return true;
		}else if(i<root.data){
			System.out.println("Searching in left");
			return search(root.left,i);
		}else{
			System.out.println("Searching in right");
			return search(root.right,i);
		}
	}
	public int getHeight() {
		// TODO Auto-generated method stub
		return getHeight(root);
	}
	private int getHeight(Node root) {
		// TODO Auto-generated method stub
		if(root == null){
			return -1;
		}
		return (1+ (getHeight(root.left)>getHeight(root.right)?getHeight(root.left):getHeight(root.right)));
	}
	
	// recursive
//	public void getBFS() {
//		// TODO Auto-generated method stub
//		if(root ==  null){
//			System.out.println("Tree is empty");
//			return;
//		}
//		Queue<Node> queue = new LinkedList<Node>();
//		queue.add(root);
//		getBFS(queue);
//	}
//	private void getBFS(Queue queue) {
//		// TODO Auto-generated method stub
//		if(queue.size() != 0){
//		Node n = (Node) queue.remove();
//		System.out.println(n.data);
//		if(n.left != null){
//			queue.offer(n.left);
//		}
//		if(n.right != null){
//			queue.offer(n.right);
//		}
//		getBFS(queue);
//		}
//	}
	//iterative:
	public void getBFS(){
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
			}
			if(n.right != null){
				queue.add(n.right);
			}
		}
	}
}
