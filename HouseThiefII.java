package dynamicProgramming;
//The adjacent houses cannot be robbed, and the houses are circled, means the first house will be the next house of the last house.
//Cannot steal both the first house & the last house.

public class HouseThiefII {

	public static void main(String[] args) {
		int[] nums = {1,3,1,3,100};
		// 2,3,2
		// 2,1,1,2
		// 1,2,1,1
		// [1,3,1,3,100]
		HouseThiefII ht = new HouseThiefII();
		System.out.print(ht.rob(nums));
	}

	public int rob(int[] nums) {
		int n = nums.length;

		if (n == 0)
			return 0;
		if (n == 1)
			return nums[0];

		if (n == 2)
			return Math.max(nums[0], nums[1]);

		int[] dp = new int[n];

		return Math.max(houseThief(dp, nums, 0, n - 2, true), houseThief(dp, nums, 1, n - 1, false));
	}

	private int houseThief(int[] dp, int[] nums, int start, int end, boolean stealFirst) {

		dp[0] = nums[0];
		if (stealFirst) {
			dp[1] = Math.max(nums[0], nums[1]);
		} else {
			dp[1] = nums[1];
			dp[2] = Math.max(dp[1], nums[2]);
		}

		for (int i = start + 2; i <= end; ++i) {
			dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
		}
		return dp[end];
	}

}
