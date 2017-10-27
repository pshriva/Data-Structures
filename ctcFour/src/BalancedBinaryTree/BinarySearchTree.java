package BalancedBinaryTree;

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
		if(root == null){ return new Node(val);}
		if(val<=root.data){root.left = insert(root.left, val);}
		else if(val>root.data){root.right = insert(root.right,val);}
		return root;
	}
	public boolean isBalanced() {
		// TODO Auto-generated method stub
		return getHeight(root) != -1;
	}
	private int getHeight(Node root) {
		// TODO Auto-generated method stub
		if(root == null){
			return 0;
		}
		int leftHeight = getHeight(root.left);
			if(leftHeight == -1){
				return -1;
			}
		int rightHeight = getHeight(root.right);
			if(rightHeight == -1){
				return -1;
			}
		if(Math.abs(leftHeight - rightHeight)>1){
			return -1;
		}
		return Math.max(leftHeight, rightHeight) + 1;
	}
}
