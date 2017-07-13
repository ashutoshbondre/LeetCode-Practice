public class Solution {
    public int strStr(String haystack, String needle) {
        if(needle==null || haystack==null || needle.length()==0) return 0;
        for( int i=0;i<=haystack.length();i++)
        {
            for(int j=0;j<=needle.length();j++)
            {
                if(j==needle.length()) return i;
                if(i+j==haystack.length()) return -1;
                if(needle.charAt(j)!=haystack.charAt(i+j)) break;
            }
        }
        return -1;
    }
}