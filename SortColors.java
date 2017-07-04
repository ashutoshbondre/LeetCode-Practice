public class Solution {
    public void sortColors(int[] nums) {
        int end =nums.length-1;
        int start=0;
        for(int i=0;i<=end;i++)
        {
            while(nums[i]==2 && i<end) swap(nums,i,end--);
            while(nums[i]==0 && i>start) swap(nums,i,start++);
        }
    }
    public void swap(int []nums,int one,int two)
    {
        int temp=nums[one];
        nums[one]=nums[two];
        nums[two]=temp;
    }
}