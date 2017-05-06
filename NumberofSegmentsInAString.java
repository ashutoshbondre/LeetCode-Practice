public class Solution {
    public int countSegments(String s) {
        if(s==null||s.length()==0) return 0;
        String[] st = ("x "+s).split("\\s+");
        return st.length-1;
    }
}
