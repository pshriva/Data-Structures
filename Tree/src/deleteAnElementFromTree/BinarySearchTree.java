package deleteAnElementFromTree;

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
		}else if(i <= root.data){
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
		}
		if(root.data == i){
			return true;
		}if(i<root.data){
			return search(root.left,i);
		}
		else{
			return search(root.right,i);
		}
	}
	public void delete(int i) {
		// TODO Auto-generated method stub
		root = delete(root,i);
	}
	private Node delete(Node root, int i) {
		// TODO Auto-generated method stub
		if(root == null){
			return root;
		}if(i<root.data){
			root.left = delete(root.left,i);
		}if(i>root.data){
			root.right = delete(root.right,i);
		}else{
			if(root.left == null  && root.right == null){
				root = null;
			}else if(root.left == null){
				root = root.right;
			}else if(root.right == null){
				root = root.left;
			}else{
				Node n = getMinimum(root.right);
				root.data = n.data;
				root.right = delete(root.right,n.data);
			}
		}
		return null;
	}
	private Node getMinimum(Node root) {
		// TODO Auto-generated method stub
		if(root == null){
			return null;
		}if(root.left == null){
			return root;
		}else{
			return getMinimum(root.left);
		}
	}
	
	
}
