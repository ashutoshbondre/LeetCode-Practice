class Solution {
    public List<int[]> pacificAtlantic(int[][] matrix) {
        List<int[]> res = new ArrayList<int[]>();
        if(matrix==null || matrix.length==0|| matrix[0].length==0) return res;
        int m = matrix.length;
        int n = matrix[0].length;
        boolean [][] pacific = new boolean[m][n];
        boolean [][] atlantic = new boolean [m][n];
        for(int i=0;i<m;i++)
        {
            dfs(matrix,pacific,Integer.MIN_VALUE,i,0);
            dfs(matrix,atlantic,Integer.MIN_VALUE,i,n-1);
        }
        for(int j=0;j<n;j++)
        {
            dfs(matrix,pacific,Integer.MIN_VALUE,0,j);
            dfs(matrix,atlantic,Integer.MIN_VALUE,m-1,j);
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(atlantic[i][j] && pacific[i][j])
                    res.add(new int[]{i,j});
            }
        }
        return res;
    }
    
    private void dfs(int [][]matrix, boolean[][]visited,int height, int x,int y)
    {
        int m=matrix.length;
        int n=matrix[0].length;
        if(x<0 || y<0 || x>=m || y>=n || visited[x][y] || height>matrix[x][y])
            return;
        visited[x][y]=true;
        dfs(matrix,visited,matrix[x][y],x+1,y);
        dfs(matrix,visited,matrix[x][y],x-1,y);
        dfs(matrix,visited,matrix[x][y],x,y+1);
        dfs(matrix,visited,matrix[x][y],x,y-1);
    }
}



