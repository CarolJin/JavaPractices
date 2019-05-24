public class ValidateBST_DFS {

	public static void main(String args[]) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(1);
	//	root.left = new TreeNode(-2147483648);
	//	root.right = new TreeNode(2147483647);
		// root.right.left = new TreeNode(6);
		// root.right.right = new TreeNode(20);

		ValidateBST_DFS dp = new ValidateBST_DFS();
		System.out.println("The BST tree is: " + dp.isValidBST(root));

	}

	public boolean isValidBST(TreeNode root) {
		if (root == null)
			return true;

		if (dfs(root))
			return true;

		return false;
	}

	long min;
	boolean firstTime = true;
	boolean isBFS = true;

	public boolean dfs(TreeNode node) {

		if (node.left != null)
			isBFS = dfs(node.left);
		if (firstTime || node.val > min) {
			min = node.val;
			firstTime = false;
		} else {
			return false;
		}
		if (node.right != null)
			isBFS = dfs(node.right);

		return isBFS;
	}
}
