public class Solution {
    public String convertToTitle(int n) {
        StringBuilder res = new StringBuilder();
        while(n>0)
        {
            n--;
            res.append((char)('A'+ n%26));
            n=n/26;
            
        }
        res.reverse();
        return res.toString();
    }
}