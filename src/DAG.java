import java.util.ArrayList;

public class DAG {
	private int V;           // number of vertices in this digraph
	private int E;                 // number of edges in this digraph
	private ArrayList<Integer>[] adj;    // adj[v] = adjacency list for vertex v
	private int[] indegree;        // indegree[v] = indegree of vertex v
	private boolean[] marked;		//Boolean List to track visited vertices

	
	//Returns current vertex
	public int V() {
		return 0;
		
	}
	
	//Adds a directed edge from v->w
	public void addEdge(int v, int w)
	{
		
	}
	
	//Returns amount of directed edges incident to current vertex
	public int indegree(int v) {
	     return indegree[v];
	}
		
	//Returns the adjacent vertices to v
	public Iterable<Integer> adj(int v)
	{ return adj[v]; }

	
}
