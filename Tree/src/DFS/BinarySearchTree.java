package DFS;

public class BinarySearchTree {
	Node root;
	public BinarySearchTree(){
		root = null;
	}
	
	
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


	public void getPreorder() {
		// TODO Auto-generated method stub
		getPreorder(root);
	}


	private void getPreorder(Node root) {
		// TODO Auto-generated method stub
		if(root == null){
			return;
		}
		System.out.println(root.data);
		getPreorder(root.left);
		getPreorder(root.right);
	}


	public void getInorder() {
		// TODO Auto-generated method stub
		getInorder(root);
	}


	private void getInorder(Node root) {
		// TODO Auto-generated method stub
		if(root == null){
			return;
		}
		getInorder(root.left);
		System.out.println(root.data);
		getInorder(root.right);
	}


	public void getPostOrder() {
		// TODO Auto-generated method stub
		getPostOrder(root);
	}


	private void getPostOrder(Node root) {
		// TODO Auto-generated method stub
		if(root == null){
			return;
		}
		getPostOrder(root.left);
		getPostOrder(root.right);
		System.out.println(root.data);
	}
}