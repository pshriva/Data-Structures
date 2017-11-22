package BinaryTreeVerticalOrderTraversal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class TreeNode {
	Node root;
	public TreeNode(){
		this.root = null;
	}
	public List<List<Integer>> verticalOrder(Node root) {
		// TODO Auto-generated method stub
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Map<Integer,List<Integer>> map = new HashMap<Integer, List<Integer>>();
		if(root == null){
			return result;
		}
		Queue<Node> queue = new LinkedList<Node>();
		Queue<Integer> degree = new LinkedList<Integer>();
		queue.offer(root);
		degree.offer(0);
		int minDegree = 0;
		int maxDegree = 0;
		while(!queue.isEmpty()){
			Node n = queue.poll();
			int deg = degree.poll();
			minDegree = Math.min(deg, minDegree);
			maxDegree = Math.max(deg, maxDegree);
			if(map.containsKey(deg)){
				map.get(deg).add(n.val);
			}else{
	            map.put(deg, new ArrayList(Arrays.asList(n.val)));
			}
			if(n.left != null){
				queue.offer(n.left);
				degree.offer(deg - 1);
			}
			if(n.right != null){
				queue.offer(n.right);
				degree.offer(deg + 1);
			}
		}
		for(int i = minDegree; i<= maxDegree; i++){
			if(map.containsKey(i)){
				result.add(map.get(i));
			}
		}
		return result;
	}
}
