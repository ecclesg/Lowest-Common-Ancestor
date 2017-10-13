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
	
	@Test
	public void testForTreeSize1(){
		LowestCommonAncestor treeSize1 = new LowestCommonAncestor();
		treeSize1.root = new Node(1);
		assertEquals("LCA(1,0)",-1,treeSize1.findLCA(1, 0));
		
		//Same node in twice then it should be ancestor
		assertEquals("LCA(1,1)",1,treeSize1.findLCA(1, 1));
	}
	
	@Test
	public void testForTreeSize7(){
		LowestCommonAncestor treeSize7 = new LowestCommonAncestor();
		treeSize7.root = new Node(1);
		treeSize7.root.left = new Node(2);
		treeSize7.root.right = new Node(3);
		treeSize7.root.left.left = new Node(4);
		treeSize7.root.left.right = new Node(5);
		treeSize7.root.right.left = new Node(6);
		treeSize7.root.right.right = new Node(7);
        
        assertEquals("LCA(4,5)", 2,treeSize7.findLCA(4, 5));
        assertEquals("LCA(4,6)", 1,treeSize7.findLCA(4, 6));
        assertEquals("LCA(3,4)", 1,treeSize7.findLCA(3, 4));
        assertEquals("LCA(6,7)", 3,treeSize7.findLCA(6, 7));
        assertEquals("LCA(5,6)", 1,treeSize7.findLCA(5, 6));
	}
	
	@Test
	public void testForTreeSize15(){
		LowestCommonAncestor treeSize15 = new LowestCommonAncestor();
		treeSize15.root = new Node(1);
		treeSize15.root.left = new Node(2);
		treeSize15.root.right = new Node(3);
		treeSize15.root.left.left = new Node(4);
		treeSize15.root.left.right = new Node(5);
		treeSize15.root.right.left = new Node(6);
		treeSize15.root.right.right = new Node(7);
		treeSize15.root.left.left.left = new Node(8);
		treeSize15.root.left.left.right = new Node(9);
		treeSize15.root.left.right.left = new Node(10);
		treeSize15.root.left.right.right = new Node(11);
		treeSize15.root.right.left.left = new Node(12);
		treeSize15.root.right.left.right = new Node(13);
		treeSize15.root.right.right.left = new Node(14);
		treeSize15.root.right.right.right = new Node(15);
		
		assertEquals("LCA(14,15)", 7,treeSize15.findLCA(14, 15));
        assertEquals("LCA(8,15)", 1,treeSize15.findLCA(8, 15));
        assertEquals("LCA(8,9)", 4,treeSize15.findLCA(8, 9));
        assertEquals("LCA(9,13)", 1,treeSize15.findLCA(9, 13));
        assertEquals("LCA(10,11)", 5,treeSize15.findLCA(10, 11));
        
	}
	
	
	
}
