/*
Given an array nums and a value val, remove all instances of that value in-place and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Example 1:

Given nums = [3,2,2,3], val = 3,

Your function should return length = 2, with the first two elements of nums being 2.

It doesn't matter what you leave beyond the returned length.
Example 2:

Given nums = [0,1,2,2,3,0,4,2], val = 2,

Your function should return length = 5, with the first five elements of nums containing 0, 1, 3, 0, and 4.

Note that the order of those five elements can be arbitrary.

It doesn't matter what values are set beyond the returned length.
*/

public class CalculateLength {

	public static void main(String[] args) {
		int[] nums = { 3, 2, 2, 3 };
		int val = 2;
		CalculateLength cl = new CalculateLength();
		System.out.println(cl.removeElement(nums, val));

	}

	public int removeElement(int[] nums, int val) {
		int len = nums.length;

		if (len == 0)
			return 0;

		int newLen = len;

		int s = 0;
		int e = len - 1;
		while (s <= e) {
			if (s == e) {
				if (nums[s] == val)
					return newLen - 1;
				else
					return newLen;
			}
			if (nums[s] != val) {
				s++;
			} else if (nums[e] == val) {
				e--;
				newLen--;
			} else {
				nums[s] = nums[e];
				s++;
				e--;
				newLen--;
			}

		}

		return newLen;

	}

}

//Make sure the first newLen of nums are without the `val`: [0,1,2,2,3,0,4,2], 2 => [0,1,4,0,3,0,4,2], first `newLen` elements are: 0,1,4,0,3
