public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rlen =matrix.length;
        if(rlen==0)return false;
        int clen = matrix[0].length;
        int row=0; int col=clen-1;
        while(row<rlen && col>=0)
        {
            if(matrix[row][col]==target)
            {
                return true;
            }
            else if(matrix[row][col]<target)
             {
                 row++;
             }
              else if(matrix[row][col]>target)
             {
                  col--;
             }
        }
        return false;
    }
}