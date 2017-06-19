public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList();
        Arrays.sort(nums);
        backtrack(list,new ArrayList<Integer>(),nums,0);
        return list;
    }
    public void backtrack(List<List<Integer>>list , List<Integer>templist,int nums[],int start)
    {
        list.add(new ArrayList<>(templist));
        for(int i=start;i<nums.length;i++)
        {
            if(i>start&&nums[i]==nums[i-1])continue;
            templist.add(nums[i]);
            backtrack(list,templist,nums,i+1);
            templist.remove(templist.size()-1);
        }
    }
}