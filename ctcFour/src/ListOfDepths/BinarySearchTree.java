package ListOfDepths;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinarySearchTree {
	Node root;
	public BinarySearchTree(){
		root = null;
	}
	public void insert(int val) {
		// TODO Auto-generated method stub
		root = insert(root, val);
	}
	private Node insert(Node root, int val) {
		// TODO Auto-generated method stub
		if(root == null){
			return new Node(val);
		}if(val<=root.data){
			root.left = insert(root.left, val);
		}else{
			root.right = insert(root.right, val);
		}
		return root;
	}
	public void getBFS() {
		// TODO Auto-generated method stub
		if(root == null){
			System.out.println("Tree is empty");
			return;
		}
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty()){
			Node n = queue.poll();
			System.out.println(n.data);
			if(n.left != null){
				queue.add(n.left);
			}if(n.right != null){
				queue.add(n.right);
			}
		}
	}
	public List getList() {
		// TODO Auto-generated method stub
		if(root == null){
			return null;
		}
		List<LinkedList<Node>> list = new ArrayList<LinkedList<Node>>();
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty()){
			int n = queue.size();
			LinkedList<Node> li = new LinkedList<Node>();
			int i = 0;
			while(i<n){
				Node node = queue.poll();
				li.add(node);
				if(node.left != null){
					queue.add(node.left);
				}if(node.right != null){
					queue.add(node.right);
				}
				i++;
			}
			list.add(li);
		}
		return list;
	}
}
