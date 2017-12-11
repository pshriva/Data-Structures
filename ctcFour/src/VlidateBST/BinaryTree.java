package VlidateBST;

public class BinaryTree {
	Node root ;
	public BinaryTree(){
	root = null;
	}
	public Node add(Node root, int val) {
		// TODO Auto-generated method stub
		return new Node(val);
	}
	public boolean checkBST() {
		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		return isBST(root, min, max);
	}
	// 1 way
//	private boolean isBST(Node root, int min, int max) {
//		// TODO Auto-generated method stub
//		if(root == null){
//			return true;
//		}
//		if(root.data > min && root.data <= max
//			&& isBST(root.left, min, root.data)
//			&& isBST(root.right,root.data,max)){
//			return true;
//		}
//		return false;
//	}
	// same as above but saves some time
	private boolean isBST(Node root, int min, int max) {
		// TODO Auto-generated method stub
		if(root == null){
			return true;
		}
		if(root.data > min && root.data <= max){
			boolean left =  isBST(root.left, min, root.data);
			if(!left)return false;
			boolean right = isBST(root.right,root.data,max);
			return right;
		}
		return false;
	}
	// other way is by traversing the tree in inOrder and checking for output, it should be in increasing order
}
