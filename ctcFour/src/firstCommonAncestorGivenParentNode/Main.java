package firstCommonAncestorGivenParentNode;

public class Main {
	public static void main(String args[]){
		BinaryTree bt = new BinaryTree();
		bt.root = new Node(50);
		bt.root.parent = null;
		bt.root.left = new Node(90);
		bt.root.left.parent = bt.root;
		bt.root.left.left = new Node(85);
		bt.root.left.left.parent = bt.root.left;
		bt.root.right = new Node(70);
		bt.root.right.parent = bt.root;
		bt.root.right.left = new Node(54);
		bt.root.right.left.parent = bt.root.right;
		bt.root.right.right = new Node(47);
		bt.root.right.right.parent = bt.root.right;
		bt.root.right.right.left = new Node(87);
		bt.root.right.right.left.parent = bt.root.right.right;
		bt.root.right.right.right = new Node(98);
		bt.root.right.right.right.parent = bt.root.right.right;
		bt.root.right.right.right.left = new Node(79);
		bt.root.right.right.right.left.parent = bt.root.right.right.right;
		bt.getBFS();
		Node n1 = bt.root.left.left;
		Node n2 =  bt.root.right.right.right.left;
		Node commonAncestor = bt.getCommonAncestor(n1,n2);
		//System.out.println(commonAncestor.data);
	}
}
