import java.util.ArrayList;
import java.util.List;

public class PathSum {

	public static void main(String args[]) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(10);
		root.left.left = new TreeNode(15);
		root.left.right = new TreeNode(14);
		root.right = new TreeNode(4);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(20);
		
		int sum = 25;

		PathSum dp = new PathSum();
		System.out.println("The paths of given sum from the tree are: " + dp.pathSum(root, sum));

	}
	
	List<List<Integer>> result = new ArrayList<List<Integer>>();

	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		
		List<Integer> al = new ArrayList<>();
		
		if(root==null) return result;
		
		hasPathSum(root, sum, al);
		
		return result;
	}

/*	private void hasPathSum(TreeNode root, int sum, List<Integer> al) {
		if(root!=null)
		al.add(root.val);
		
		if(root.val==sum && root.left==null & root.right==null) {			
			result.add(al);
		}
		
		if(root.left!=null) {
			hasPathSum(root.left, sum-root.val, new ArrayList<>(al));

		}
		
		if(root.right!=null) {
			hasPathSum(root.right, sum-root.val, new ArrayList<>(al));

		}
		
	}
	*/

//Improve the code as below, the performance will be better. 
//Instead of `new ArrayList<>()` in every recursion for each `path`, we only new it when adding the valid path to `result`.
//Remove/reset and reuse `path` arrayList instead.

private void hasPathSum(TreeNode root, int sum, List<Integer> path) {
        
        path.add(root.val);
        
        if (root.left == null && root.right == null) {
            if (sum == root.val) {
                result.add(new ArrayList<>(path));
            }
            return;
        }
        
        if (root.left != null) {
            hasPathSum(root.left, sum - root.val, path);
            path.remove(path.size() - 1);
        }
        
        if (root.right != null) {
            hasPathSum(root.right, sum - root.val, path);
            path.remove(path.size() - 1);
        }

   }
}
