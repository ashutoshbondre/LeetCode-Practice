/*
1.The key task here is to connect those emails, and this is a perfect use case for union find.
2.to group these emails, each group need to have a representative, or parent.
3.At the beginning, set each email as its own representative.
4.Emails in each account naturally belong to a same group, and should be joined by assigning to the same parent (let’s use the parent of first email in that list)
*/

class Solution {
    public List<List<String>> accountsMerge(List<List<String>> acts) {
        Map<String, String> owner = new HashMap<>(); //Owner is actual Owner -> John
        Map<String, String> parents = new HashMap<>();
        Map<String, TreeSet<String>> unions = new HashMap<>();
        
        //loop to set parent of each email to itself & owner of each email to the first name 
        for (List<String> a : acts) {
            for (int i = 1; i < a.size(); i++) {
                parents.put(a.get(i), a.get(i));
                owner.put(a.get(i), a.get(0));
            }
        }
        
        // loop to set parent of each list's email id to the first email id in the list 
        for (List<String> a : acts) {
            String p = find(a.get(1), parents);
            for (int i = 2; i < a.size(); i++)
                parents.put(find(a.get(i), parents), p);
        }
        
        //loop to merge parents, first email id is key-> its children is value, treeset to get them in sorted order
        for(List<String> a : acts) {
            String p = find(a.get(1), parents);
            if (!unions.containsKey(p)) unions.put(p, new TreeSet<>());
            for (int i = 1; i < a.size(); i++)
                unions.get(p).add(a.get(i));
        }
        
        //final answer to match owner with email IDs
        List<List<String>> res = new ArrayList<>();
        for (String p : unions.keySet()) {
            List<String> emails = new ArrayList(unions.get(p));
            emails.add(0, owner.get(p));
            res.add(emails);
        }
        return res;
    }
    // To merge parents: union find
    private String find(String s, Map<String, String> p) {
        return p.get(s) == s ? s : find(p.get(s), p);
    }
}