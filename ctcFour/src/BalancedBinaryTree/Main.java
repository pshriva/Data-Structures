package BalancedBinaryTree;

public class Main {
	public static void main(String args[]){
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(70);
		bst.insert(50);
		bst.insert(90);
		bst.insert(80);
		bst.insert(95);
		bst.insert(45);
		bst.insert(60);
		bst.insert(55);
		bst.insert(65);
		//bst.insert(53);
		boolean balanced = bst.isBalanced();
		if(balanced == true){System.out.println("Balanced");}
		else{System.out.println("Not balanced");}
	}
}
