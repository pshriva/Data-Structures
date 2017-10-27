package BFSorLevelOrderTraversal;
//TC is O(n) for both recursive and iterative call
//SC is O(n) worst case, as maximum no of elements in the queue at eny time = number of leaves
// which is n/2 for a perfect binary tree. ao SC = O(n), best case will be O(1)
public class Main {
	public static void main(String args[]){
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(10);
		bst.insert(13);
		bst.insert(9);
		boolean b = bst.search(13);
		System.out.println(b);
		System.out.println(bst.getHeight());
		bst.getBFS();
	}
}
