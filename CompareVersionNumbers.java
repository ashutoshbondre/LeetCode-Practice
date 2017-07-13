public class Solution {
    public int compareVersion(String version1, String version2) {
        String [] level1 = version1.split("\\.");
        String[] level2 = version2.split("\\.");
        int length = Math.max(level1.length,level2.length);
        for(int i=0;i<length;i++)
        {
            Integer v1 = i<level1.length ? Integer.parseInt(level1[i]) :0; 
            // CANNOT USE int as its primitive type, we can't call methods like .compare to on primitive types, hence we must use INTEGER.
            Integer v2 = i<level2.length ? Integer.parseInt(level2[i]) :0;
            int ans = v1.compareTo(v2);
            if(ans!=0) return ans;
        }
        return 0;
    }
}