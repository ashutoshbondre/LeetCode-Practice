class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points.length==0) return 0;
        Arrays.sort(points, (a,b)->a[1]-b[1]);
        int count = 1;
        int arrowpos = points[0][1];
        for(int i=1;i<points.length;i++)
        {
            if(arrowpos>=points[i][0])
                continue;
            count++;
            arrowpos = points[i][1];
        }
        return count;
    }
}