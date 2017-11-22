package connectedComponentsInAnUndirectedGraph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

//length of connected components in an undirected graph
public class Main {
	public static void main(String args[]){
		int n = 7;
		int[][] edges = {{0,1},{1,2},{3,4}, {4,5}, {5,6}};
		int connectedComponents = getNumberOfConnectedComponents(n, edges);
		System.out.println(connectedComponents);
	}

	private static int getNumberOfConnectedComponents(int n, int[][] edges) {
		// TODO Auto-generated method stub
		if(n == 0){return 0;}
		if(n == 1){return 1;}
		List<Set<Integer>> list = new ArrayList<Set<Integer>>();
		for(int i = 0; i<n ; i++){
			list.add(new HashSet<Integer>());
		}
		//for(int i = 0; i<n ; i++){
			for(int[] edge : edges){
				list.get(edge[0]).add(edge[1]);
				list.get(edge[1]).add(edge[0]);
			}
		//}
		boolean[] visited = new boolean[n];
		int count = 0;
		for(int i = 0; i<n; i++){
			if(visited[i] != true){
				count++;
				Queue<Integer> queue = new LinkedList<Integer>();
				queue.offer(i);
				while(!queue.isEmpty()){
					int node = queue.poll();
					visited[node] = true;
					for(int next : list.get(node)){
						if(!visited[next])queue.add(next);
					}
				}
			}
		}
		return count;
	}
}
