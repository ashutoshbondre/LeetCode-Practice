public class Solution {
    int n;
    int m;
    public int numIslands(char[][] grid) {
        n=grid.length;
        if (n==0) return 0;
         m=grid[0].length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=='1')
                {
                    dfs(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    public void dfs(char[][]grid,int i,int j)
    {
        if(i<0||j<0||i>=n||j>=m||grid[i][j]=='0') return;
        grid[i][j]='0';
        dfs(grid,i,j+1);
        dfs(grid,i+1,j);
        dfs(grid,i,j-1);
        dfs(grid,i-1,j);
    }
}