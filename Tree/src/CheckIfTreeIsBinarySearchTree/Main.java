package CheckIfTreeIsBinarySearchTree;

public class Main {
	public static void main(String args[]){
		Tree tree = new Tree();
		tree.root = new Node(5);
		tree.root.left = new Node(10);
		tree.root.right = new Node(15);
		tree.root.left.left = new Node(20);
		tree.root.left.right = new Node(25);
		tree.root.right.left = new Node(30);
		tree.root.right.right = new Node(35);
		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		boolean b = isBinaryTree(tree.root, min, max);
		System.out.println(b);
		Tree tree1 = new Tree();
		tree1.root = new Node(11);
		tree1.root.left = new Node(9);
		tree1.root.right = new Node(15);
		tree1.root.left.left = new Node(7);
		tree1.root.left.right = new Node(10);
		tree1.root.right.left = new Node(14);
		tree1.root.right.right = new Node(35);
		boolean b1 = isBinaryTree(tree1.root, min, max);
		System.out.println(b1);
	}
// see mycodeschool video for reference
	private static boolean isBinaryTree(Node root, int min, int max) {
		// TODO Auto-generated method stub
		if(root == null){
			return true;
		}
		if(root.data>min && root.data<=max
		   && isBinaryTree(root.left,min,root.data)
		   && isBinaryTree(root.right,root.data,max)){
		return true;
		}
		return false;
	}
// or simply make a BFS search and see if the elements are in increasing order then tree is BST
}
