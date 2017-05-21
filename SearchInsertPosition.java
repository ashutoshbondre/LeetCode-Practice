public class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target) return i;
        }
        
            if(nums[0]>target) return 0;
            if(nums[nums.length-1]<target) return nums.length;
            for(int i=1;i<nums.length;i++)
            {
                if(nums[i]>target && nums[i-1]<target)
                return i;
            }
        
        return -1;
    }
}
