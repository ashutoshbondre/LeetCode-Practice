public class Solution {
    public boolean isIsomorphic(String s, String t) {
        char [] c1 = s.toCharArray();
        char [] c2 = t.toCharArray();
        HashMap<Character,Character> map = new HashMap<Character,Character>();
        for(int i =0;i<c1.length;i++)
        {
            if(map.containsKey(c1[i]))
            {
                char ans = map.get(c1[i]);
                if(ans!=c2[i]) return false;
            }
            else
            {
                if(!map.containsValue(c2[i]))
                map.put(c1[i],c2[i]);
                else return false;
            }
        }
        return true;
    }
}
