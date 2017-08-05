public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
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
                templist.add(nums[i]);
                helper(res,templist,nums,target-nums[i],i);
                templist.remove(templist.size()-1);
            }
        }
    }
}