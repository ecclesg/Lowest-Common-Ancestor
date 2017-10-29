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
	
	
	@Test
	public void testAddEdge(){
		DAG test4 = new DAG(5);
		test4.addEdge(3, 9);
		test4.addEdge(-2, -5);	
	}
	
	@Test
	public void testinDegree(){
		DAG test5 = new DAG(5);
		assertEquals("", -1, test5.indegree(-3));
	}
	
	@Test
	public void testOutDegree(){
		DAG test6 = new DAG(5);
		assertEquals("", -1, test6.outdegree(8));	
	}
	
	
	@Test(expected=Exception.class)
	public void exceptionTest(){
		//Can't make a directed graph with less than 0 vertices
		DAG test3 = new DAG(-5);
	}
	
	
	
	
	
	//Following tests check Directed ACYCLIC Graph class works correctly
	@Test
	public void testsForCycle(){
			DAG cyclic = new DAG(20);
			cyclic.addEdge(0, 1);
			cyclic.addEdge(1, 2);
			cyclic.addEdge(2, 0);
			cyclic.addEdge(2, 3);
			cyclic.addEdge(3, 4);
			
			//Parameter is first vertex
			cyclic.findCycle(0);
			
			//Cycle from 2-0
			assertTrue(cyclic.hasCycle());
	}
	
	@Test
	public void testForAcyclicGraph(){
			DAG acyclic = new DAG(20);
			acyclic.addEdge(0, 1);
			acyclic.addEdge(1, 2);
			acyclic.addEdge(2, 3);
			//Parameter is first vertex
			acyclic.findCycle(0);
			assertFalse(acyclic.hasCycle());
	}

	
	
	//Following tests check the LCA function for a DAG graph
	@Test
	public void testLCA(){
		DAG lca = new DAG(8);
		
		//--------2---5----7--
		//---0--1-------6----8
		//--------3---4-------
		lca.addEdge(0, 1);
		lca.addEdge(1, 2);
		lca.addEdge(1, 3);
		lca.addEdge(2, 5);
		lca.addEdge(3, 4);
		lca.addEdge(4, 6);
		lca.addEdge(5, 6);
		lca.addEdge(6, 8);
		lca.addEdge(5, 7);
		lca.addEdge(7, 8);
		
		assertEquals("", 1, lca.findLCA(5, 4));
		assertEquals("", 5, lca.findLCA(7, 8));
		assertEquals("", 4, lca.findLCA(6, 4));
	}
	
	
}
