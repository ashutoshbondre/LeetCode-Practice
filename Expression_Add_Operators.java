class Solution {
    public List<String> addOperators(String num, int target) {
        ArrayList<String> ans  = new ArrayList<String>();
        if(num.length()==0 || num==null) return ans;
        helper(ans,"",num,target,0,0,0);
        return ans;
    }
    
    public void helper(ArrayList<String> ans , String prefix,String num, int target, int pos, long eval, long multed)
    {
        if(pos==num.length())
        {
            if(eval==target)
                ans.add(prefix);
            return;
        }
        for(int i=pos;i<num.length();i++)
        {
            if(i!=pos && num.charAt(pos)=='0')
                break;
            long curr = Long.parseLong(num.substring(pos,i+1));
            if(pos==0)
                helper(ans,prefix+curr,num,target,i+1,curr,curr);
            else
            {
                helper(ans,prefix+'+'+curr,num,target,i+1,eval+curr,curr);
                helper(ans,prefix+'-'+curr,num,target,i+1,eval-curr,-curr);
                helper(ans,prefix+'*'+curr,num,target,i+1,eval-multed+multed*curr,multed*curr);
            }
        }
    }
}