public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        helper(res,new ArrayList<Integer>(),candidates,target,0);
        return res;
    }
    
    public void helper(List<List<Integer>> res , ArrayList<Integer> templist,int[] nums,int target, int start)
    {
        if(target<0) return;
        else if(target==0) {
            res.add(new ArrayList<Integer>(templist));
            return;
        }
        else{
            for(int i=start;i<nums.length;i++)
            {
                if(i>start && nums[i]==nums[i-1]) continue;
                templist.add(nums[i]);
                helper(res,templist,nums,target-nums[i],i+1);
                templist.remove(templist.size()-1);
            }
        }
    }
}