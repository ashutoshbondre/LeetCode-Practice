class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(char c:tasks)
            map.put(c,map.getOrDefault(c,0)+1);
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b)->b-a);
        pq.addAll(map.values());
        
        int allCount =0;
        int batch = n+1;
        while(!pq.isEmpty())
        {
            List<Integer> templist = new ArrayList<Integer>();
            int currCount=0;
            for(int i=0;i<batch;i++)
            {
                if(!pq.isEmpty())
                {
                    templist.add(pq.poll());
                    currCount++;
                }   
            }
            for(int num:templist)
            {
                if(--num>0)
                    pq.offer(num);
            }
            allCount += !pq.isEmpty()? batch : currCount;
        }
        return allCount;
    }
}