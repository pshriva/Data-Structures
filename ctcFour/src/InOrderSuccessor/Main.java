package InOrderSuccessor;

public class Main {
	public static void main(String args[]){
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(70);
		bst.insert(50);
		bst.insert(90);
		bst.insert(80);
		bst.insert(95);
		bst.insert(50);
		bst.insert(60);
		bst.insert(50);
		bst.insert(55);
		bst.insert(65);
		bst.insert(53);
		//bst.getBFS();
		Node successor = bst.getSuccessor(bst.root);
		System.out.println(bst.root.data);
		if(successor == null){
			System.out.println("No successor found");
		}else{
			System.out.println("Successor is " + successor.data);
		}
	}
}
