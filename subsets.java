package backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsets {

	public static void main(String[] args) {
		int[] nums = {1,2,2};
		subsets sb = new subsets();
		sb.subsetsWithDup(nums);

	}

	public List<List<Integer>> subsetsWithDup(int[] nums) {

		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> subSet = new ArrayList<>();

		Arrays.sort(nums);

		backtrack(nums, ans, subSet, 0);

		return ans;
	}

	private void backtrack(int[] nums, List<List<Integer>> ans, List<Integer> subSet, int start) {
		int n = nums.length;

		if (!ans.contains(subSet)) {
			ans.add(new ArrayList<Integer>(subSet));
		}

		if (start == n) {
			return;
		}

		for (int i = start; i < n; i++) {
			if (i > start && nums[i] == nums[i - 1])
				continue;
			subSet.add(nums[i]);
			backtrack(nums, ans, subSet, i + 1);
			subSet.remove(subSet.size() - 1);
		}
	}

}
