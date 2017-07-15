int findMin(vector<int> &num) {
        int start=0,end=num.size()-1;
        
        while (start<end) {
            if (num[start]<num[end])
                return num[start];
            
            int mid = (start+end)/2;
            
            if (num[mid]>=num[start]) {
                start = mid+1;
            } else {
                end = mid;
            }
        }
        
        return num[start];
    }
/*
public class Solution {
    public int findMin(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(min>nums[i]) min=nums[i];
        }
        return min;
    }
}
/*
