public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<Integer>();
        res.add(0);
        for(int i=0;i<n;i++)
        {
            for(int k=res.size()-1;k>=0;k--)
            {
                res.add(res.get(k)|1<<i);
            }
        }
        return res;
    }
}