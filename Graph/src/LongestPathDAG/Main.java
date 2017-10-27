package LongestPathDAG;

public class Main {
	public static void main(String args[]){
		int V = 11;
		Graph g = new Graph(V);
//		g.addEdge(0,2);
//		g.addEdge(0,3);
//		g.addEdge(0,4);
//		g.addEdge(2,5);
//		g.addEdge(1,2);
//		g.addEdge(1,7);
//		g.addEdge(3,5);
//		g.addEdge(3,7);
//		g.addEdge(4,7);
//		g.addEdge(5,6);
//		g.addEdge(6,7);
		g.addEdge(0,1);
		g.addEdge(1,2);
		g.addEdge(9,2);
		g.addEdge(1,6);
		g.addEdge(6,8);
		g.addEdge(2,4);
		g.addEdge(2,3);
		g.addEdge(6,7);
		g.addEdge(4,5);
		g.addEdge(5,10);
		g.print();
		int path = g.getLongestPath();
		System.out.println("Longest Graph path is " + path);
	}
}
