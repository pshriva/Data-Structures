package binarySearchTreeSimpleOperations;


public class Main {
	public static void main(String args[]){
		BinarySearchTree bst = new BinarySearchTree();
		//bst.insert(10);
		bst.insert(10);
		bst.insert(13);
		bst.insert(16);
		boolean b = bst.search(13);
		System.out.println(b);
	}
}
