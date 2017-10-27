package deleteAnElementFromTree;

public class Main {
	public static void main(String args[]){
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(12);
		bst.insert(5);
		bst.insert(17);
		bst.insert(3);
		bst.insert(7);
		bst.insert(13);
		bst.insert(17);
		bst.insert(1);
		bst.insert(9);
		bst.insert(14);
		bst.insert(20);
		bst.insert(8);
		bst.insert(11);
		bst.insert(18);
		//boolean b = bst.search(13);
		//System.out.println(b);
		System.out.println(bst.search(13));
		bst.delete(12);
		System.out.println(bst.search(13));
	}
}
