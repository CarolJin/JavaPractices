/*You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Note: Given n will be a positive integer.

Example 1:

Input: 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
*/

//Same performance, 0 ms	32.8 MB:

//Bottom Up solution:
class Solution {
        
    public int climbStairs(int n) {
                
        if(n == 0) return 0; 
        if(n == 1) return 1;
        if(n == 2) return 2;
        
        int[] dp = new int[n];
        
        return bottomUp(dp, n);
        
    }
    
    private int bottomUp(int[] dp, int n) {
        
        dp[0] = 1;        
        dp[1] = 2;
        
        for(int i = 2; i < n; i++) {
            dp[i] = dp[i-2] + dp[i-1];
        }        
        
        return dp[n-1];
    }
}

//Top Down Solution
class Solution {
        
    public int climbStairs(int n) {
                
        if(n == 0) return 0; 
        
        int[] dp = new int[n];
        
        return topDown(dp, n);
        
    }
    
    private int topDown(int[] dp, int n) {
        
        if(n == 1) {
            dp[0] = 1;
            return dp[0];
        }
        
        if(n == 2) {
            dp[1] = 2;
            return dp[1];
        }
        
        if(dp[n-1] == 0) {
            dp[n-1-2] =topDown(dp, n-2); 
            dp[n-1-1] =topDown(dp, n-1);
            dp[n-1] = dp[n-1-2] + dp[n-1-1];
        }        
        
        return dp[n-1];
    }
}
