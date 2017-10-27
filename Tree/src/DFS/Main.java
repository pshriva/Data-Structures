package DFS;
//TC for all DFS is O(n)  and SC O(h) = O(logn)
public class Main {
	public static void main(String args[]){
		BinarySearchTree bst = new BinarySearchTree();
		//bst.insert(10);
		bst.insert(10);
		bst.insert(0);
		bst.insert(100);
		bst.insert(1);
		bst.insert(4);
		bst.insert(13);
		bst.insert(103);
		boolean b = bst.search(13);
		System.out.println(b);
		System.out.println("Elements in preorder are ");
		bst.getPreorder();
		System.out.println("Elements in Inorder are ");
		bst.getInorder();
		System.out.println("Elements in postorder are ");
		bst.getPostOrder();
	}
}

