//Given an array nums of n integers and an integer target, are there elements a, b, c, and d in nums such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
            
        int len = nums.length;
        
        if(len<4) return res;
        
        if(len==4) {
            if(target == nums[0]+nums[1]+nums[2]+nums[3])
                res.add(Arrays.asList(nums[0],nums[1],nums[2],nums[3]));
            return res;
        }
        
        Arrays.sort(nums);
        
        for(int a = 0; a < len-3; a++) {

            int complement = target - nums[a];
            for(int b = a+1; b < len-2; b++) {                
                int c = b+1;
                int d = len-1;
                while(c < d) { 
                     
                    if(c<len && d>0 && complement==nums[b]+nums[c]+nums[d]) {
                        res.add(Arrays.asList(nums[a],nums[b],nums[c],nums[d]));
                        c++;
                        d--;
                        while(c<d && nums[c]==nums[c-1]) {
                            c++;
                        }
                        while(d>c && nums[d]==nums[d+1]) {
                            d--;
                        }
                        while(b+1<len-2 && nums[b+1]==nums[b]) {
                            b++;
                        }
                        while(a+1<len-3 && nums[a+1]==nums[a]) {
                            a++;
                        }
                    } else if(c<len && d>0 && complement>nums[b]+nums[c]+nums[d]) {
                        c++;
                    } else if(c<len && d>0 && complement<nums[b]+nums[c]+nums[d]) {
                        d--;
                    }
                }                
            }
        }        
        return res;
    }
}

/*
Input:
[-1,0,-5,-2,-2,-4,0,1,-2]
-9
Expected:
[[-5,-4,-1,1],[-5,-4,0,0],[-5,-2,-2,0],[-4,-2,-2,-1]]

Input:
[-1,2,2,-5,0,-1,4]
3
Expected:
[[-5,2,2,4],[-1,0,2,2]]

Input:
[-1,-5,-5,-3,2,5,0,4]
-7
Expected:
[[-5,-5,-1,4],[-5,-3,-1,2]]

Input:
[-1,0,1,2,-1,-4]
-1
Expected:
[[-4,0,1,2],[-1,-1,0,1]]

Input:
[-3,-2,-1,0,0,1,2,3]
0
Expected:
[[-3,-2,2,3],[-3,-1,1,3],[-3,0,0,3],[-3,0,1,2],[-2,-1,0,3],[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]

Input:
[0,0,0,0]
0
Expected:
[[0,0,0,0]]
*/
