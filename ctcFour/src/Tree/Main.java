package Tree;

public class Main {
	public static void main(String args[]){
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(50);
		bst.insert(60);
		bst.insert(45);
		bst.insert(40);
		bst.insert(48);
		bst.insert(54);
		bst.insert(70);
		bst.insert(43);
		bst.getBFS();
	}
}
