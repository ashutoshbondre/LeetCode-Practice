public class Solution {
    public void rotate(int[][] matrix) 
    {
        for (int row=0;row<matrix.length;row++)
        {
            for(int col=row;col<matrix[0].length;col++)
            {
                int temp = 0;
                temp=matrix[row][col];
                matrix[row][col]=matrix[col][row];
                matrix[col][row]=temp;
            }
            
        }
        for(int row=0;row<matrix.length;row++)
        {
            for(int col=0;col<matrix.length/2;col++)
            {
                int temp=0;
                temp=matrix[row][col];
                matrix[row][col]=matrix[row][matrix.length-1-col];
                matrix[row][matrix.length-1-col] =temp;
            }
        }
    }
}
