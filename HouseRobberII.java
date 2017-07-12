public class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        return Math.max(helper(nums,0,nums.length-2),helper(nums,1,nums.length-1));
    }
    
    public int helper(int []nums, int lo, int hi)
    {
        int a=0;
        int b=0;
        for(int i=lo;i<=hi;i++)
        {
            if(i%2==0)
            {
                a=Math.max(a+nums[i],b);
            }
            else
            {
                b=Math.max(a,b+nums[i]);
            }
        }
        return Math.max(a,b);
    }
}