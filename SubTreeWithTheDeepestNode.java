/*
Given a binary tree rooted at root, the depth of each node is the shortest distance to the root.
A node is deepest if it has the largest depth possible among any node in the entire tree.
The subtree of a node is that node, plus the set of all descendants of that node.
Return the node with the largest depth such that it contains all the deepest nodes in its subtree.

Example 1:
Input: [3,5,1,6,2,0,8,null,null,7,4]	Output: [2,7,4]
Input: [0,1,3,null,2]    output: [2] ???
*/

public class SubTreeWithTheDeepestNode {

	public static void main(String args[]) {
		TreeNode root = new TreeNode(0);
		root.left = new TreeNode(1);
		root.right = new TreeNode(3);
		root.left.right = new TreeNode(2);
		root.right.right = new TreeNode(8);

		SubTreeWithTheDeepestNode dp = new SubTreeWithTheDeepestNode();	
		
		System.out.println("Deepest subtree is: " + dp.subtreeWithAllDeepest(root).val);

	}

	public TreeNode subtreeWithAllDeepest(TreeNode root) {
        if( root==null ) return root;
        int L=height(root.left);
        int R=height(root.right);
        if( L==R ) return root;
        if( L<R ) return subtreeWithAllDeepest( root.right );
        else return subtreeWithAllDeepest( root.left );
    }
    
    private static int height( TreeNode node )
    {
        if( node==null ) return 0;
        return 1+Math.max( height(node.left), height(node.right) );
    }
}
	
	class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }
