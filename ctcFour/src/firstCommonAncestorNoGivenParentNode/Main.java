package firstCommonAncestorNoGivenParentNode;

public class Main {
	public static void main(String args[]){
		BinaryTree bt = new BinaryTree();
		bt.root = new Node(50);
		bt.root.left = new Node(90);
		bt.root.left.left = new Node(85);
		bt.root.right = new Node(70);
		bt.root.right.left = new Node(54);
		bt.root.right.right = new Node(47);
		bt.root.right.right.left = new Node(87);
		bt.root.right.right.right = new Node(98);
		bt.root.right.right.left.right = new Node(42);
		bt.root.right.right.left.left = new Node(79);
		bt.root.right.right.left.right.left = new Node(99);
		bt.root.right.right.left.right.right = new Node(77);
		//bt.getBFS();
		//Node n1 = bt.root.right.right.left.left;
		Node n1 = bt.root.left;
		Node n2 = bt.root.right;
		Node commonAncestor = bt.getCommonAncestor(n1,n2);
		if(commonAncestor == null){
			System.out.println("No common ancestor found");
		}else{
			System.out.println("Common ancestor is " + commonAncestor.data);
		}
	}
}
