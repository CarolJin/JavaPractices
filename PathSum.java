//Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

public class PathSum1 {

	public static void main(String[] args) {
		// [5,4,8,11,null,13,4,7,2,null,null,null,1] 22
		/*
		 * TreeNode root = new TreeNode(5); root.left = new TreeNode(4);
		 * root.right = new TreeNode(8); root.left.left = new TreeNode(11);
		 * root.right.left = new TreeNode(13); root.right.right = new
		 * TreeNode(4); root.left.left.left = new TreeNode(7);
		 * root.left.left.right = new TreeNode(2); root.left.left.left.right =
		 * new TreeNode(1);
		 */

		TreeNode root = new TreeNode(0);
		root.left = new TreeNode(1);
		root.right = new TreeNode(1);

		int sum = 0;

		PathSum1 dp = new PathSum1();
		System.out.println("The given sum from the tree: " + dp.hasPathSum(root, sum));

	}

	public boolean hasPathSum(TreeNode root, int sum) {

		if (root == null)
			return false;

		if (root.left == null && root.right == null)
			return sum == root.val;

		return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
	}

}
