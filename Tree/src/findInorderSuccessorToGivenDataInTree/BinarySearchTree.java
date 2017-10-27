package findInorderSuccessorToGivenDataInTree;

public class BinarySearchTree {
	Node root;
	public BinarySearchTree(){
		root = null;
	}
	public void insert(int i) {
		// TODO Auto-generated method stub
		root= insert(root,i);
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
	public int getInorderSuccessor(int i) {
		// TODO Auto-generated method stub
		
		Node n =  getInorderSuccessor(root,i);
		return n != null?n.data:-1;
	}
	private Node getInorderSuccessor(Node root, int i) {
		// TODO Auto-generated method stub
		Node current = searchNode(root, i);
		if(current == null){
			return null;
		}
		//Case1. if the node has right sucessor, we return the minimum in the right subtree
		if(current.right !=null){
			return getMinimumNode(current.right);
		}
		//case 2: when there is no right subtree
		else{
			Node ancestor = root;
			Node successor = null;
			while(ancestor != current){
				if(current.data < ancestor.data){
					successor = ancestor;
					ancestor = ancestor.left;
				}else{
					ancestor = ancestor.right;
				}
			}
			return successor;
		}
	}
	private Node searchNode(Node root, int i) {
		// TODO Auto-generated method stub
		if(root == null){
			return null;
		}
		if(root.data == i){
			return root;
		}if(i<root.data){
			return searchNode(root.left,i);
		}else{
			return searchNode(root.right,i);
		}
	}
	private Node getMinimumNode(Node root) {
		// TODO Auto-generated method stub
		if(root == null){
			return null;
		}if(root.left == null){
			return root;
		}else{
			return getMinimumNode(root.left);
		}
	}
}
