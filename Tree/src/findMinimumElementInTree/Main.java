package findMinimumElementInTree;

public class Main {
	public static void main(String args[]){
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(19);
		bst.insert(32);
		bst.insert(0);
		bst.insert(56);
		boolean b = bst.search(32);
		System.out.println(b);
		System.out.println(bst.getMinimum(bst.root));
	}
}
