import java.util.ArrayList;

public class DAG {
	private int V;           // number of vertices in this digraph
	private int E;                 // number of edges in this digraph
	private ArrayList<Integer>[] adj;    // adj[v] = adjacency list for vertex v
	private int[] indegree;        // indegree[v] = indegree of vertex v
	private boolean[] marked;		//Boolean List to track visited vertices

	
	public DAG(int V)
	{
		if (V < 0) throw new IllegalArgumentException("Number of vertices in a Digraph must be nonnegative");
	    this.V = V;
	    this.E = 0;
	    indegree = new int[V];
	    adj = (ArrayList<Integer>[]) new ArrayList[V];
	    for (int v = 0; v < V; v++) {
	        adj[v] = new ArrayList<Integer>();
	    }
	}

	//Returns current vertex
	public int V() {
		return V;	
	}
	
	public int E() {
        return E;
    }

	
	
	//Adds a directed edge from v->w
	public void addEdge(int v, int w)
	{
		validateVertex(v);
	    validateVertex(w);
	    adj[v].add(w);
	    indegree[w]++;
	    E++;

	}
	
	public void validateVertex(int v) {
        if (v < 0 || v >= V)
        	throw new IllegalArgumentException("vertex " + v + " is not between 0 and " + (V-1));    }

	
	//Returns amount of directed edges incident to vertex v
	public int indegree(int v) {
		validateVertex(v);
        return indegree[v];

	}
	
	//Returns amount of directed edges from vertex v
	public int outdegree(int v) {
        validateVertex(v);
        return adj[v].size();
    }
		
	
	//Returns the adjacent vertices to v
	public Iterable<Integer> adj(int v)
	{ return adj[v]; }

	
}
