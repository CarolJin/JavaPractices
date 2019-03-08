package freePractice;

import java.util.Map;
import java.util.HashMap;
//Given an array of integers, return indices of the two numbers such that they add up to a specific target.

public class TwoSum2 {
	
	 public static void main(String [] args){
	        int [] nums = {2, 7, 11, 15};
	        int  target = 9;
	        int[] results = twoSum(nums,target);
	        printSum(results);
	    }

	public static int[] twoSum(int[] nums, int target) {
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        map.put(nums[i], i);
	    }
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        if (map.containsKey(complement) && map.get(complement) != i) {
	            return new int[] { i, map.get(complement) };
	        }
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}
	
	public static void printSum(int[] results){
		for (int i = 0; i < results.length; i++) {
			System.out.print(results[i] + " ");
		}
	}
}
