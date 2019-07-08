package freePractice;
//Given an array of integers, return indices of the two numbers such that they add up to a specific target.

class TwoSum {
	   public static int[] twoSum(int[] nums, int target) {
	      int sum =0;
	      int [] result = new int[2];
	      for(int i=0; i< (nums.length-1); i++){
	          for(int j=i+1; j< nums.length; j++){
	            sum=nums[i]+nums[j];
	            if(sum==target){
	                result[0]=i;
	                result[1]=j; 
	                return result;
	            }
	          }
	       }
	       throw new IllegalArgumentException("No two sum solution");
	   }
	   
	   public static void printSum(int[] results){
			for (int i = 0; i < results.length; i++) {
				System.out.print(results[i] + " ");
			}
		}
	   
	    public static void main(String [] args){
	        int [] nums = {3,2,4};
	        int  target = 6;
	        int[] results = twoSum(nums,target);
	        printSum(results);
	    }
	}
