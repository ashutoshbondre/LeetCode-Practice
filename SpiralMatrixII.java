public class Solution {
    public int[][] generateMatrix(int n) {
        
        int matrix[][] = new int [n][n];
        if(n==0) return matrix;
         int rows=0;
         int rowe=matrix.length-1;
         int cols=0;
         int cole=matrix[0].length-1;
         int num=1;
         while(rows<=rowe && cols<=cole)
         {
             for(int j =cols;j<=cole;j++)
             {
                 matrix[rows][j] = num++;
             }
             rows++;
             for(int j=rows;j<=rowe;j++)
             {
                 matrix[j][cole]=num++;
             }
             cole--;
             if(rows<=rowe)
             {
              for(int j=cole;j>=cols;j--)
             {
                 matrix[rowe][j]=num++;
             }
             rowe--;
             }
             if(cols<=cole)
             {
              for(int j=rowe;j>=rows;j--)
             {
                 matrix[j][cols]=num++;
             }
             cols++;
             }
         }
         return matrix;
    }
    
}