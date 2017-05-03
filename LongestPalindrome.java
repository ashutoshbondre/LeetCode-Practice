public class Solution {
    public int longestPalindrome(String s) {
        if(s==null || s.length()==0) return 0;
        int count=0;
        HashSet<Character> set = new HashSet<Character>();
        for(int i=0;i<s.length();i++)
        {
            char c =s.charAt(i);
            if(set.contains(c))
           {
               set.remove(c);
               count++;
           }
           else
           {
               set.add(c);
           }
        }
        if(!set.isEmpty()) return count*2+1;
        return count*2;
    }
}
