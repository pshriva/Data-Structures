package graphUsingAdjacencyList;
import java.util.LinkedList;

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
	public void printGraph() {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < V; i++){
			System.out.println("Adjacency list of Vertex " + i + " is" );
			for(int j : adjList[i]){
				System.out.println(j);
			}
		}
	}
}
