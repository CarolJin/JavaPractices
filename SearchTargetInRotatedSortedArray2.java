package binarySearch;

public class SearchTargetInRotatedSortedArray2 {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5 };
		int target = 0;

		SearchTargetInRotatedSortedArray2 result = new SearchTargetInRotatedSortedArray2();
		System.out.println(result.search(arr, target));

	}

	public int search(int[] nums, int target) {

		int start = 0;
		int end = nums.length - 1;

		while (end >= start) {
			int mid = start + (end - start) / 2;

			if (nums[mid] == target)
				return mid;

			if (nums[mid] > nums[end]) {
				if (nums[mid] > target && target > nums[end])
					end = mid - 1;
				else
					start = mid + 1;
			} else {
				if (target > nums[mid] && target <= nums[end])
					start = mid + 1;
				else
					end = mid - 1;
			}
		}
		return -1;
	}
}
