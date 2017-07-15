public class Solution {
    public boolean isPalindrome(String s) {
        if(s==null) return true;
        char cHead;
        char cTail;
        int start =0;
        int end = s.length()-1;
        while(start<=end)
        {
            cHead=s.charAt(start);
            cTail=s.charAt(end);
           if(!Character.isLetterOrDigit(cHead))
           {
               start++;
           }
            else if (!Character.isLetterOrDigit(cTail))
            {
                end--;
            }
                else
                {
                    if (Character.toLowerCase(cHead)!=Character.toLowerCase(cTail)) return false;
                    
                    start++;
                    end--;
                } 
        }
        return true;
    }
}