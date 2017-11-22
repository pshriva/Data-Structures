package BinaryTreeVerticalOrderTraversal;

import java.util.List;

public class Main {
	public static void main(String args[]){
		TreeNode bt = new TreeNode();
		bt.root = new Node(1);
		bt.root.left = new Node(2);
		bt.root.right = new Node(3);
		bt.root.left.left = new Node(4);
		bt.root.left.right = new Node(5);
		bt.root.right.left = new Node(6);
		bt.root.right.right = new Node(7);
		bt.root.right.left.right = new Node(8);
		bt.root.right.right.right = new Node(9);
		List<List<Integer>> list = bt.verticalOrder(bt.root);
		for(List l : list){
			System.out.println("Vertical order traversal is ");
			System.out.println(l);
		}
	}
}
