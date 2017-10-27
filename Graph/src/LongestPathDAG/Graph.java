package LongestPathDAG;

import java.util.LinkedList;
import java.util.Queue;

public class Graph {
	int V;
	LinkedList<Integer> adjList[];
	public Graph(int V){
		this.V = V;
		adjList = new LinkedList[V];
		for(int i = 0; i <V; i++){
			adjList[i] = new LinkedList();
		}
	}
	public void addEdge(int source, int destination) {
		// TODO Auto-generated method stub
		adjList[source].add(destination);
	}
	public void print() {
		// TODO Auto-generated method stub
		for(int i = 0; i<V ; i++){
			for(int j : adjList[i]){
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	public int getLongestPath() {
		// TODO Auto-generated method stub
		int[] inbound = new int[V];
		int[] longestPath = new int[V];
		int maxPath = 0;
		Queue<Integer> queue = new LinkedList();
		for(int i = 0; i<V ; i++){
			for(int j : adjList[i]){
				inbound[j] = inbound[j] + 1;
			}
		}
		for(int i = 0; i<V; i++){
			if(inbound[i] == 0){
				queue.add(i);
			}
		}
		while(!queue.isEmpty()){
			int vertex = queue.poll();
			inbound[vertex] = -1;
			for(int i : adjList[vertex]){
				inbound[i] = inbound[i] - 1;
				longestPath[i] = Math.max(longestPath[i], 1+longestPath[vertex]);
				if(inbound[i] == 0){
					queue.add(i);
				}
			}
		}
		for(int i = 0; i<V ; i++){
			maxPath = Math.max(maxPath, longestPath[i]);
		}
		
		return maxPath;
	}
}
