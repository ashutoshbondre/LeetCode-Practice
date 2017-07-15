public class Solution {
    public String reverseWords(String s) {
        if(s==null) return null;
        StringBuilder sb = new StringBuilder();
        String st[] = s.trim().split("\\s+");
        for(int i=st.length-1;i>0;i--)
        {
            sb.append(st[i]+" ");
        }
        sb.append(st[0]);
        return sb.toString();
    }
}