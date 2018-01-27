class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res= new ArrayList<String>();
        if(nums.length==0 || nums==null) return res;
        int start = nums[0];
        int end=nums[0];
        for(int i=1;i<=nums.length;i++)
        {
        if(i==nums.length && start==end) {res.add(new String(Integer.toString(start))); return res;}
        if(i==nums.length && start!=end) {res.add(new String(Integer.toString(start)+"->"+Integer.toString(end))); return res;}
            if(nums[i]==nums[i-1]+1)
            {
                end++;
            }
            else
            {
                if(start==end)
                {
                    res.add(new String(Integer.toString(start)));
                }
                else
                {
                    res.add(new String(Integer.toString(start)+"->"+Integer.toString(end)));
                }
                start=nums[i];
                end=nums[i];
            }
            
        }
        return res;
            
    }
}