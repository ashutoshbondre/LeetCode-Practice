public class Solution {
    public int findPeakElement(int[] nums) {
        int peak=-1;
        int [] dummy = new int[nums.length+2];
        if(nums.length==0 || nums.length ==1) return 0;
        for(int i=0;i<nums.length;i++)
        {
            if(i==0) 
            { if(nums[1]<nums[0]) peak=i;}
            if(i==nums.length-1) 
            { if(nums[nums.length-2]<nums[nums.length-1]) peak=i;}
            if(i!=0 && i!=nums.length-1 && nums[i-1]<nums[i] && nums[i+1]<nums[i])
                peak=i;
        }
        return peak;
    }
}
/* public int findPeakElement(int[] num) {    
    return helper(num,0,num.length-1);
}

public int helper(int[] num,int start,int end){
    if(start == end){
        return start;
    }else if(start+1 == end){
        if(num[start] > num[end]) return start;
        return end;
    }else{
        
        int m = (start+end)/2;
        
        if(num[m] > num[m-1] && num[m] > num[m+1]){

            return m;

        }else if(num[m-1] > num[m] && num[m] > num[m+1]){

            return helper(num,start,m-1);

        }else{

            return helper(num,m+1,end);

        }
        
    }
}
/*