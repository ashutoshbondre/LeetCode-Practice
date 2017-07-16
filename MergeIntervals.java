/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        if(intervals.size()<=1) return intervals;
        intervals.sort((i1,i2)->Integer.compare(i1.start,i2.start));
        List<Interval> result = new LinkedList<Interval>();
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        for(Interval inter:intervals)
        {
            if(inter.start<=end)
            {
                end =Math.max(end,inter.end);
            }
            else
            {
                result.add(new Interval(start,end));
                start=inter.start;
                end=inter.end;     
            }
        }
        result.add(new Interval(start,end));
        return result;
    }
}