public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list,new ArrayList<Integer>(),nums);
        return list;
    }
    public void backtrack(List<List<Integer>>list,ArrayList<Integer>templist,int []nums)
    {
        if(nums.length==templist.size())
        list.add(new ArrayList<>(templist));
        else
        {
            for(int i=0;i<nums.length;i++)
            {
                if(templist.contains(nums[i])) continue;
                else
                {
                    templist.add(nums[i]);
                    backtrack(list,templist,nums);
                    templist.remove(templist.size()-1);
                }
            }
        }
    
        
    }
}