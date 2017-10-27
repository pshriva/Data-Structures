package heightOfBinaryTree;

import java.util.NoSuchElementException;

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
			root.left = insert(root.left,i);
		}else{
			root.right = insert(root.right,i);
		}
		return root;
	}
	public boolean search(int i) {
		// TODO Auto-generated method stub
		return search(root,i);
	}
	private boolean search(Node root, int i) {
		// TODO Auto-generated method stub
		if(root == null){
			return false;
		}if(root.data == i){
			return true;
		}if(i<root.data){                                                                                    
			return search(root.left,i);
		}else{
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
		return (1 + (getHeight(root.left)>=getHeight(root.right)?getHeight(root.left):getHeight(root.right)));
	}
}
