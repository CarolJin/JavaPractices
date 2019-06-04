public class BinarySearch {

	public static void main(String[] args) {
		// Example 1:
		//Input: nums = [-1,0,3,5,9,12], target = 9
		//Output: 4
		//Explanation: 9 exists in nums and its index is 4

		//Example 2:

		//Input: nums = [-1,0,3,5,9,12], target = 2
		//Output: -1
		//Explanation: 2 does not exist in nums so return -1

		int[] arr = {-1,0,3,5,9,12};
		int target = 9; 
		System.out.println(search(arr, target));
	}
	public static int search(int[] nums, int target) {
        if(nums.length==0 || nums==null || target>nums[nums.length-1] || target<nums[0]) return -1;
        
        return searhInHalf(nums, 0, nums.length-1,target);
        
    }
    
    private static int searhInHalf(int[] nums,int start, int end, int target){

        if(start==end){
            if(target==nums[start])
            return start;
            else return -1;
        }            
        
        int middle = (end+start+1)/2;
        if(middle>=0){
          if(nums[middle]==target) return middle;
          else if(nums[middle]>target)  return searhInHalf(nums, start, middle-1, target);
          else if(nums[middle]<target)  return searhInHalf(nums,middle+1,end,target); 
        }
        
        return -1;
    }
    
    /*public int search(int[] nums, int target) {
		int result = -1, left = 0, right = nums.length - 1;
		if (nums[left] == target) {
			return left;
		}
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] > target) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return result;
	}*/
}
