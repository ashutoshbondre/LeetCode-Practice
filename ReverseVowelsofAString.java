class Solution {
    
    public String reverseVowels(String s) {
        if(s==null || s.length()==0 || s.length()==1) return s;
        Set<Character> set = new HashSet<Character>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        int start=0;
        int end = s.length()-1;
        //char[] original = s.toCharArray();
        char [] c = new char[s.length()];
        while(start<=end)
        {
            if(set.contains(s.charAt(start)))
            {
                while(end>=start && !set.contains(s.charAt(end)))
                {
                    c[end] = s.charAt(end);
                    end--;
                }
                if(start!=end) 
                {
                    c[start] = s.charAt(end);
                    c[end] = s.charAt(start);
                    end--;
                }
                else
                    c[start] = s.charAt(start);
                start++;
            }
            else
            {
                c[start] = s.charAt(start);
                start++;
            }
        }
        return new String(c);
    }
}