import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LowestCommonAncestorTEST {

	@Test
	public void testForEmptyTree(){
		LowestCommonAncestor treeEmpty = new LowestCommonAncestor();
		assertEquals("LCA(Empty)",-1,treeEmpty.findLCA(0, 0));
		assertEquals("LCA(Empty)",-1,treeEmpty.findLCA(1, 0));
	}
	
	@Test
	public void testAncestorNode(){
		LowestCommonAncestor treeAncestorNode = new LowestCommonAncestor();
		treeAncestorNode.root = new Node(11);
		treeAncestorNode.root.left = new Node(21);
		treeAncestorNode.root.right = new Node(5);
		treeAncestorNode.root.left.left = new Node(7);
		treeAncestorNode.root.left.right = new Node(8);
		treeAncestorNode.root.right.left = new Node(9);
        treeAncestorNode.root.right.right = new Node(33);
		
        assertEquals("LCA(7,8)",21,treeAncestorNode.findLCA(7, 8));
         
        //Test when one is the ancestor
        assertEquals("LCA(7,21)", 21,treeAncestorNode.findLCA(7, 21));
        assertEquals("LCA(5,9)", 5,treeAncestorNode.findLCA(5, 9));
        assertEquals("LCA(11,21)", 11,treeAncestorNode.findLCA(11, 21));
	}
	
	@Test
	public void testTwoNodes(){
		
		LowestCommonAncestor tree = new LowestCommonAncestor();
		tree.root = new Node(3);
		tree.root.left = new Node(7);
		assertEquals("LCA(3,3)",3,tree.findLCA(3, 7));
			
	}
	
	
	
	
	
	
}
