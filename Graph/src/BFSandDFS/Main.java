package BFSandDFS;

import java.util.Stack;

public class Main {
	public static void main(String args[]){
		int V = 8;
		Graph graph = new Graph(V);
		graph.addEdge(0,2);
		graph.addEdge(0,7);
		graph.addEdge(7,4);
		graph.addEdge(7,6);
		graph.addEdge(4,1);
		graph.addEdge(6,1);
		graph.addEdge(6,3);
		graph.addEdge(3,5);
		graph.addEdge(1,5);
		//graph.print();
		graph.breadthFirstTraverse();
		System.out.println("Doing DFS");
		graph.depthFirstTraverse();
		
//		public void depthFirstTraverse() {
//			// TODO Auto-generated method stub
//			boolean[] visited = new boolean[V];
//			Stack<Integer> stack = new Stack();
//			for(int i = 0; i<V ; i++){
//				if(!visited[i]){
//					traverse(visited, i, stack);
//				}
//			}
//		}
//		private void traverse(boolean[] visited, int node, Stack stack) {
//			// TODO Auto-generated method stub
//			visited[node] = true;
//			System.out.println(node);
//			stack.push(node);
//			for(int i : adjList[node]){
//				if(!visited[i]){
//					traverse(visited, i, stack);
//				}else{
//					if(stack.size()>=2){
//						stack.pop();
//						int next = (int) stack.pop();
//						for(int element : adjList[next]){
//							if(!visited[next]){
//								traverse(visited, i, stack);
//							}
//						}
//					}
//					return;
//				}
//			}
//		}
	}
}
