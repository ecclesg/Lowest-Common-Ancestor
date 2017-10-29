import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class DAGTest {
	
	//Following tests check Directed Graph class works correctly
	@Test
	public void testForDirectedGraph(){
		DAG test = new DAG(10);
		test.addEdge(1, 2);
		test.addEdge(1, 3);
		test.addEdge(3, 4);
		test.addEdge(4, 5);
		test.addEdge(4, 6);
		
		assertEquals("", 1, test.indegree(4));
		assertEquals("", 2, test.outdegree(4));
		assertEquals("", 5, test.E());
		assertEquals("", 10, test.V());
		String ans = "[5, 6]";
		assertEquals("",ans, test.adj(4).toString());
	}
	
	@Test(expected=Exception.class)
	public void exceptionTest(){
		//Can't make a directed graph with less than 0 vertices
		DAG test3 = new DAG(-5);
		
		//DAG test4 = new DAG(5);
		//Can't add an edge to a vertices > V(5)
		//test4.addEdge(3, 9);
		//test4.addEdge(-2, 3);
		//test4.addEdge(0, 5);		
	}
	
	
	
	
	
	//Following test check Directed ACYCLIC Graph class works correctly
	@Test
	public void testForDirecedAcyclicGraph(){
			
	}
	

	
	
	//Following tests check the LCA function for a DAG graph
	@Test
	public void testForEmptyTree(){
		
	}
	
	@Test
	public void testForTree1Vertex(){
	}
	
	@Test
	public void testForNonExistingVertices(){
	}
	
	
}
