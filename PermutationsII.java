public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        boolean [] bool = new boolean[nums.length];
        backtrack(list,new ArrayList<Integer>(),bool,nums);
        return list;
    }
    public void backtrack(List<List<Integer>> list,ArrayList<Integer>templist,boolean[]bool,int []nums)
    {
        if(nums.length==templist.size())
        list.add(new ArrayList<>(templist));
        else
        {
            for(int i=0;i<nums.length;i++)
            {
                if(bool[i] || i>0&&nums[i]==nums[i-1] && !bool[i-1])continue;
                bool[i]=true;
                templist.add(nums[i]);
                backtrack(list,templist,bool,nums);
                templist.remove(templist.size()-1);
                bool[i]=false;
                
            }
        }
    }
}