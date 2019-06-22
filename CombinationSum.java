/* Given a set of candidate numbers (candidates) (without duplicates) and a target number (target), find all unique combinations in candidates where the candidate numbers sums to target.

The same repeated number may be chosen from candidates unlimited number of times.

Note:

All numbers (including target) will be positive integers.
The solution set must not contain duplicate combinations.
Example 1:

Input: candidates = [2,3,6,7], target = 7,
A solution set is:
[
  [7],
  [2,2,3]
]
Example 2:

Input: candidates = [2,3,5], target = 8,
A solution set is:
[
  [2,2,2,2],
  [2,3,3],
  [3,5]
]
*/

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> solution = new ArrayList<>();        
            
        if(candidates==null || candidates.length==0) 
            return ans;
        
        Arrays.sort(candidates);
        
        int n = candidates.length;
        getConbinations(candidates, target, solution, ans, n-1);
        
        return ans;
    }
    
    private void getConbinations(int[] candidates, int target, List<Integer> solution, List<List<Integer>> ans, int start) {
        
        if(target==0) {
            ans.add(new ArrayList<>(solution));
        }
        
        if(candidates[0] > target) return;
        
        for( int i = start;i>=0; i--) {
            if(candidates[i]>target) {
                continue;
            }
            else {
                solution.add(candidates[i]);
                getConbinations(candidates,target-candidates[i], solution, ans, i);
                solution.remove(solution.size()-1);
            }
        }
    }
}

/*Runtime: 2 ms, faster than 99.86% of Java online submissions for Combination Sum.
Memory Usage: 37.4 MB, less than 99.70% of Java online submissions for Combination Sum.*/
