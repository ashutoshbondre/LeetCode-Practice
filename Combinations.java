public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        ArrayList<Integer> templist = new ArrayList<Integer>();
        helper(result,templist,1,n,k);
        return result;
    }
    
    public void helper(List<List<Integer>> result, ArrayList<Integer> templist,int start,int n,int k)
    {
        if(k==0)
        {
            result.add(new ArrayList<Integer>(templist));
            return;
        }
        else
        {
            for(int i=start;i<=n;i++)
            {
                templist.add(i);
                helper(result,templist,i+1,n,k-1);
                templist.remove(templist.size()-1);
            }
        }
    }
}