package VlidateBST;

public class Main{
	public static void main(String args[]){
		BinaryTree bt = new BinaryTree();
		bt.root = bt.add(bt.root, 70);
		bt.root.left = bt.add(bt.root.left, 50);
		bt.root.right = bt.add(bt.root.right, 90);
		bt.root.left.left = bt.add(bt.root.left.left, 45);
		bt.root.left.right = bt.add(bt.root.left.right, 60);
		bt.root.right.left = bt.add(bt.root.right.left, 80);
		bt.root.right.right = bt.add(bt.root.right.right, 95);
		bt.root.left.right.left = bt.add(bt.root.left.right.left, 55);
		bt.root.left.right.right = bt.add(bt.root.left.right.right, 65);
		bt.root.left.right.left.left = bt.add(bt.root.left.right.left.left, 53);
		boolean isBST = bt.checkBST();
		if(isBST == true){
			System.out.println("Tree is BST");
		}else{
			System.out.println("Tree is not BST");
		}
	}
}