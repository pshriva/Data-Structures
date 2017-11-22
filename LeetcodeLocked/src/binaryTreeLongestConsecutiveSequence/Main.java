package binaryTreeLongestConsecutiveSequence;

public class Main {
	public static void main(String args[]){
		TreeNode root = new TreeNode(2);
		root.right = new TreeNode(3);
		root.right.left = new TreeNode(2);
		root.right.left.left = new TreeNode(1);
		int sequenceLength = getSequenceLength(root);
		System.out.println(sequenceLength);
	}

	private static int getSequenceLength(TreeNode root) {
		// TODO Auto-generated method stub
		return getSequenceLength(root, 1, 0);
	}

	private static int getSequenceLength(TreeNode root, int length, int parent) {
		// TODO Auto-generated method stub
		if(root == null){return length-1;}
		length = (root.val - parent == 1)?length : 1;
		int left = getSequenceLength(root.left, length+1, root.val);
		int right = getSequenceLength(root.right, length+1, root.val);
		return Math.max(length, Math.max(left, right));
	}
}
