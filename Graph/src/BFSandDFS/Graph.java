package BFSandDFS;
//DFS  for unweighted graph and undirected graph is its longest path traversal
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Graph {
	int V;
	LinkedList<Integer> adjList[];
	public Graph(int V){
		this.V = V;
		adjList = new LinkedList[V];
		for(int i = 0; i<V; i++){
			adjList[i] = new LinkedList(); 
		}
	}
	public void addEdge(int source, int destination) {
		// TODO Auto-generated method stub
		adjList[source].addFirst(destination);
		adjList[destination].addFirst(source);
	}
	public void print() {
		// TODO Auto-generated method stub
		for(int i = 0; i< V ; i++){
			for(int j : adjList[i]){
				System.out.print(" " + j);
			}
			System.out.println();
		}
	}
	public void breadthFirstTraverse() {
		boolean[] visited = new boolean[V];
		Queue<Integer> queue = new LinkedList();
		visited[0] = true;
		queue.add(0);
		System.out.println("Elements are ");
		while(queue.size() != 0){
			int s = queue.remove();
			System.out.println(s);
			for(int i = 0 ; i<adjList[s].size() ; i++){
				int node = adjList[s].get(i);
				if(!visited[node]){
					visited[node] = true;
					queue.add(node);
				}
			}
		}
	}
	//using stack and recursion
	public void depthFirstTraverse() {
		// TODO Auto-generated method stub
		boolean[] visited = new boolean[V];
		Stack<Integer> stack = new Stack();
		for(int i = 0; i<V ; i++){
			if(!visited[i]){
				traverse(visited, i, stack);
			}
		}
	}
	private void traverse(boolean[] visited, int node, Stack stack) {
		// TODO Auto-generated method stub
		if(visited[node] == false){
			visited[node] = true;
			System.out.println(node);
			stack.push(node);
		}
		for(int i : adjList[node]){
			if(!visited[i]){
				traverse(visited, i, stack);
			}else{
				if(stack.size()>=2){
					stack.pop();
					int next = (int) stack.pop();
					traverse(visited, next, stack);
				}
				return;
			}
		}
	}
	
	
	
}
