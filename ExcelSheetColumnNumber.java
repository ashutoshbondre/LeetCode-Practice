public class Solution {
    public int titleToNumber(String s) {
        char [] c = s.toCharArray();
        int res =0;
        int itr=1;
        for(int i =c.length-1;i>=0;i--)
        {
            res=res+ (itr * (int)(c[i]-'A' +1));
            itr=itr*26;
        }
        return res;
    }
}