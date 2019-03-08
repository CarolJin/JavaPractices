package freePractice;

//Sum of minimum elements of all subarrays
//Input: A = [3, 1, 2, 4]
//Output: 17
//Explanation: Subarrays are [3], [1], [2], [4], [3, 1], [1, 2], [2, 4], [3, 1, 2], [1, 2, 4], [3, 1, 2, 4].
//Minimums are 3, 1, 2, 4, 1, 1, 2, 1, 1, 1. Sum is 17.
//
//Input : A = [1, 2, 3, 4]
//Output : 20

public class SumOfMinimumElementOfAllSubArrays {
	//O(n)
	public static int minSubArraySum(int[] arr) {
	    int minSum = 0;
	    int curSum = 0;
	    for (int num : arr) {
	        curSum += num;
	        minSum = Math.min(minSum, curSum);
	        curSum = Math.min(curSum, 0);
	    }
	    return minSum;
	}
	public static void main(String[] args) {
        int arr[] = {1, 2, 3}; 
       // int n = arr.length; 
        System.out.println("Sum of SubArray " + minSubArraySum(arr)); 
    } 
}
