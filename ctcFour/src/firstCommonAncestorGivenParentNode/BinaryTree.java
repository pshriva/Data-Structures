package firstCommonAncestorGivenParentNode;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	Node root;
	public BinaryTree(){
		root = null;
	}
	public Node getCommonAncestor(Node n1, Node n2) {
		// TODO Auto-generated method stub
//		if(n1 == root || n2 == root){
//			return null;
//		}
		int depthN1 = getDepth(n1);
		int depthN2 = getDepth(n2);
		Node first = depthN1>depthN2?n1:n2;
		Node second = depthN1>depthN2?n2:n1;
		int i = depthN2;
		while(i != depthN1){
			first = first.parent;
			i--;
		}
		while(first != second && first != null && second != null){
			first = first.parent;
			second = second.parent;
		}
		if(first == null || second == null){
			return null;
		}
		return first;
		}
	private int getDepth(Node n) {
		// TODO Auto-generated method stub
		int depth = 0;
		while(n != root){
			n = n.parent;
			depth++;
		}
		return depth;
	}
	public void getBFS() {
		// TODO Auto-generated method stub
		if(root == null){
			System.out.println("Tree is empty");
		}
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty()){
			int size = queue.size();
			System.out.println("Displaying elements at each level");
			for(int i = 0; i<size; i++){
				Node n = queue.poll();
				System.out.println(n.data);
				if(n.left != null){
					queue.add(n.left);
				}
				if(n.right != null){
					queue.add(n.right);
				}
			}
		}
	}
}
