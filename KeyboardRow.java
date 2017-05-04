public class Solution {
    public String[] findWords(String[] words) {
       String [] word = new String[words.length];
       for(int i=0;i<words.length;i++)
       {
           word[i]=words[i].toLowerCase();
       }
       List<String> ans = new ArrayList<String>();
       for(int i=0;i<words.length;i++)
       {
           if(word[i].matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*"))
           {
               ans.add(words[i]);
           }
       }
       String [] answer = new String[ans.size()];
       answer = ans.toArray(answer);
       return answer;
    }
}
