public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs ==null || strs.length==0) return new ArrayList<List<String>>();
        HashMap<String, ArrayList<String>> hmap = new HashMap<String, ArrayList<String>>();
        Arrays.sort(strs);
        for(String s: strs)
        {
            char [] c = s.toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);
            if(!hmap.containsKey(key)) hmap.put(key,new ArrayList<String>());
            hmap.get(key).add(s);
        }
        return new ArrayList<List<String>>(hmap.values());
    }
}