public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        if(matrix.length==0)
         return res;
         int rows=0;
         int rowe=matrix.length-1;
         int cols=0;
         int cole=matrix[0].length-1;
         while(rows<=rowe && cols<=cole)
         {
             for(int j =cols;j<=cole;j++)
             {
                 res.add(matrix[rows][j]);
             }
             rows++;
             for(int j=rows;j<=rowe;j++)
             {
                 res.add(matrix[j][cole]);
             }
             cole--;
             if(rows<=rowe)
             {
              for(int j=cole;j>=cols;j--)
             {
                 res.add(matrix[rowe][j]);
             }
             rowe--;
             }
             if(cols<=cole)
             {
              for(int j=rowe;j>=rows;j--)
             {
                 res.add(matrix[j][cols]);
             }
             cols++;
             }
         }
         return res;
    }
    
}