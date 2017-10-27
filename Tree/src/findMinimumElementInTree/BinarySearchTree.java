package findMinimumElementInTree;

import java.util.NoSuchElementException;
// to maximum element, just change the method in here to search for right child instead of left
public class BinarySearchTree {
	Node root;
	public BinarySearchTree(){
		root = null;
	}
	public void insert(int i) {
		// TODO Auto-generated method stub
		Node n = new Node(i);
		if(root == null){
			root = n;
			return;
		}
		Node current = root;
		Node parent = null;
		while(true){
			parent = current;
			if(i<=current.data){
				current = current.left;
				if(current == null){
					parent.left = n;
					return;
				}
			}else{
				current = current.right;
				if(current == null){
					parent.right = n;
					return;
				}
			}
		}
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
	// recursive
//	public int getMinimum(Node root) {
//		// TODO Auto-generated method stub
//		if(root == null){
//			throw new NoSuchElementException("Tree is empty");
//		}if(root.left == null){
//			return root.data;
//		}else{
//			return getMinimum(root.left);
//		}
//	}
	//iterative
	public int getMinimum(Node root){
		if(root == null){
			throw new NoSuchElementException("Tree is empty");
		}
		Node n = root;
		while(n.left != null){
			n = n.left;
		}
		return n.data;
	}
}
