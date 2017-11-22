package binaryTreeLongestConsecutiveSequence;

public class Main {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(6);
		root.right = new TreeNode(9);
		root.right.left = new TreeNode(7);
		root.right.right = new TreeNode(10);
		root.right.right.right = new TreeNode(11);
		root.right.right.right.left = new TreeNode(12);
		root.right.right.right.right = new TreeNode(12);
		root.right.right.right.right.left = new TreeNode(13);
		int l = getLongestSequence(root);
		System.out.println(l);
	}

	private static int getLongestSequence(TreeNode node) {
		// TODO Auto-generated method stub
		if(node == null){return 0;}
		return getLongestSequence(node, 1, 0);
	}

	private static int getLongestSequence(TreeNode node, int length, int parent) {
		// TODO Auto-generated method stub
		if(node == null){return length-1;}
		length = (node.val - parent == 1)?length : 1;
		int left = getLongestSequence(node.left, length+1, node.val);
		int right = getLongestSequence(node.right, length+1, node.val);
		return Math.max(length, Math.max(left, right));
	}
}
