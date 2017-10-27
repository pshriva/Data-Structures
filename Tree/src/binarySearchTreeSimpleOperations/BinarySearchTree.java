package binarySearchTreeSimpleOperations;

public class BinarySearchTree {
	Node root;
	public BinarySearchTree(){
		root = null;
	}
	//Iterative sollutions
//	public void insert(int element) {
//		// TODO Auto-generated method stub
//		Node n = new Node(element);
//		if(root == null){
//			root = n;
//			return;
//		}
//		Node current = root;
//		Node parent = null;
//		while(true){
//			parent = current;
//			if(element<current.data){
//				current = current.left;
//				if(current == null){
//					parent.left = n;
//					return;
//				}
//			}if(element>= current.data){
//				current = current.right;
//				if(current == null){
//					parent.right = n;
//					return;
//				}
//			}
//		}
//		
//	}
	
	
	public boolean search(int element) {
		// TODO Auto-generated method stub
		return search(root,element);
	}
	private boolean search(Node root, int element) {
		// TODO Auto-generated method stub
		if(root == null){
			return false;
		}
		if(root.data == element){
			return true;
		}if(element<root.data){
			return search(root.left,element);
		}else{
			return search(root.right,element);
		}
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
		}else if(i>root.data){
			root.right = insert(root.right,i);
		}
		return root;
	}
}