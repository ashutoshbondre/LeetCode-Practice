class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length <=1) return ;
        int i = nums.length-1;
        for(; i>=1;i--)
        {
            if(nums[i]>nums[i-1])
                break;
        }
        if(i!=0)
        {
            swap(nums,i-1);
        }
        reverse(nums,i);
    }
    
    
    public void swap(int []nums,int index)
    {
        for(int n = nums.length-1; n>0;n--)
        {
            if(nums[n]>nums[index])
            {
                int temp = nums[index];
                nums[index] = nums[n];
                nums[n]=temp;
                break;
            }
        }
    }
    
    public void reverse(int [] nums, int index)
    {
        int last = nums.length-1;
        int first = index;
        while(first<last)
        {
            int temp = nums[first];
            nums[first]=nums[last];
            nums[last] = temp;
            first++;
            last--;
        }
    }
}


// Exmaple to work with:
// 132 -> 213