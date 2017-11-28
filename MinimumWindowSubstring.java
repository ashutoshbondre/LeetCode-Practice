class Solution {
    public String minWindow(String s, String t) {
        if(s==""||t.length()>s.length())
            return new String("");
        int [] chars = new int [128];
        for(char c:t.toCharArray())
        {
            chars[c]++;
        }
        int start = 0, end = 0, count  = t.length(),min = Integer.MAX_VALUE,minstart = 0;
        while(end<s.length())
        {
            if(chars[s.charAt(end)]>0)
                count--;
            chars[s.charAt(end)]--;
            end ++ ;
            while(count==0)
            {
                if(end-start<min)
                {
                    minstart =start;
                    min=end-start;
                }
                if(++chars[s.charAt(start)] >0)
                    count++;
                start++;
            }
            
        }
        return min==Integer.MAX_VALUE? "":s.substring(minstart,minstart+min);
        
    }
}
