class Solution {
    public int maximalSquare(char[][] matrix) {
        int n=matrix.length;
        if(n==0) return 0;
        int m=matrix[0].length;
        int max=0;
        int [][]b = new int[n+1][m+1];
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
               if(matrix[i-1][j-1]=='1')
               {
                   b[i][j]= Math.min(Math.min(b[i-1][j],b[i][j-1]),b[i-1][j-1]) +1;
                   max = Math.max(max,b[i][j]);
               }
            }
        }
        return max*max;
    }
}