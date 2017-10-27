package MinimalTree;

import java.util.LinkedList;
import java.util.Queue;

public class MinimalHeightTree {
	Node root;
	public MinimalHeightTree(){
		root = null;
	}
	public void createMinimumHeightTree(int[] arr) {
		// TODO Auto-generated method stub
		root = getMinimumTree(root, arr, 0, arr.length-1);
	}
	private Node getMinimumTree(Node root, int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		if(end<start){
			return null;
		}
		if(arr.length == 0) return null;
		int mid = start + (end-start)/2;
		root = new Node(arr[mid]);
		root.left = getMinimumTree(root.left, arr, start, mid - 1);
		root.right = getMinimumTree(root.right, arr, mid + 1, end);
		return root;
	}
	public void print() {
		// TODO Auto-generated method stub
		if(root == null){
			System.out.println("Tree is empty");
		}
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty()){
			Node n = queue.poll();
			System.out.println(n.data);
			if(n.left != null)queue.add(n.left);
			if(n.right != null)queue.add(n.right);
		}
	}
}
