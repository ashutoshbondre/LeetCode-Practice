class Solution {
    public int[][] reconstructQueue(int[][] people) {
      Arrays.sort(people, (a, b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);
        // intervals.sort((i1, i2) -> Integer.compare(i1.start, i2.start));
        List<int[]>res = new ArrayList<int[]>();
        for(int[] p:people)
        {
            res.add(p[1],p);
        }
        return res.toArray(new int [people.length][]);
    }
}