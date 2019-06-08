/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Search in Rotated Sorted Array.
Memory Usage: 36.3 MB, less than 100.00% of Java online submissions for Search in Rotated Sorted Array.
*/

public class SearchTargetInRotatedSortedArray {

	public static void main(String[] args) {
		int[] arr = {1,3,5};
		int target = 0;

		SearchTargetInRotatedSortedArray result = new SearchTargetInRotatedSortedArray();
		System.out.println(result.search(arr, target));

	}

	public int search(int[] nums, int target) {
		int n = nums.length;

		if (n <= 0)
			return -1;

		if (n == 1) {
			if (nums[0] == target)
				return 0;
			return -1;
		}

		if (target == nums[0])
			return 0;
		if (target == nums[n - 1])
			return n - 1;

		if (n > 2) {
			int pivot = findPivot(nums, 0, n - 1);

			if (pivot == -1 || pivot==n-1 && target > nums[pivot])
				return -1;

			if (target == nums[pivot])
				return pivot;

			if (target > nums[0] && target < nums[pivot])
				return findTarget(nums, 0, pivot, target);

			if (pivot < n - 1 && target >= nums[pivot + 1] && target < nums[n - 1])
				return findTarget(nums, pivot + 1, n - 1, target);
		}

		return -1;
	}

	private int findPivot(int[] nums, int start, int end) {
		
        while (end > start) {
            int mid = start + (end - start) / 2;
            
            if(mid ==0) {
            	 return mid;
            }
            
            if (mid == end && nums[mid] > nums[mid- 1]
                    || mid == 0 && nums[mid] > nums[mid + 1]
                    || mid < end && nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) //eg. 3,5,1  (5)
                return mid;
            
            if (nums[mid] > nums[end]) start = mid + 1;  // eg. 3,4,5,6,1,2
            else end = mid;  // eg. 5,6,1,2,3,4         
        }		
		return start;
	}

	private int findTarget(int[] nums, int start, int end, int target) {
		
		
		if (nums[start] == target)
			return start;

		while (end >= start) {
			int mid = start + (end - start) / 2;
			if (nums[mid] == target)
				return mid;
			if (nums[mid] > target)
				end = mid - 1;
			if (nums[mid] < target)
				start = mid + 1;
		}
		return -1;
	}

}
