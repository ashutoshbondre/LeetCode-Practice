public class Solution {
    public int minPathSum(int[][] grid) {
        int r = grid.length;
        int c=grid[0].length;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(i==0 && j!=0)
                {
                    grid[i][j]=grid[i][j]+grid[i][j-1];
                }
                else if(i!=0 && j==0)
                { 
                    grid[i][j]=grid[i][j]+grid[i-1][j];
                }
                else if(i==0 && j==0)
                {
                    grid[i][j]=grid[i][j];
                }
                else
                {
                    grid[i][j]=grid[i][j]+ Math.min(grid[i][j-1],grid[i-1][j]);
                }
            }
        }
        return grid[r-1][c-1];
    }
}