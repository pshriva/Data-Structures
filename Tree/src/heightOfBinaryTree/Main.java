package heightOfBinaryTree;
// To find height of tree, we visit each node only once, so the TC is O(n)
public class Main {
	public static void main(String args[]){
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(10);
		bst.insert(0);
		bst.insert(100);
		bst.insert(10);
		bst.insert(0);
		bst.insert(100);
		bst.insert(90);
		bst.insert(0);
		boolean b = bst.search(90);
		System.out.println(b);
		System.out.println("Height of tree is " + bst.getHeight());
	}
}
