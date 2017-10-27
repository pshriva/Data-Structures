package findInorderSuccessorToGivenDataInTree;
// TC is O(h) or O(logn) h = height of tree, n = number of nodes of tree
public class Main {
	public static void main(String args[]){
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(15);
		bst.insert(10);
		bst.insert(20);
		bst.insert(8);
		bst.insert(12);
		bst.insert(17);
		bst.insert(25);
		bst.insert(6);
		bst.insert(11);
		bst.insert(16);
		bst.insert(27);
		System.out.println(bst.search(14));
		int data = 12;
		System.out.println("Successor of" + data + " in InOrder traversal of tree is " + bst.getInorderSuccessor(data));
	}
}
