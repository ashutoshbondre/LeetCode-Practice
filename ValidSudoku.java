public class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set seen  = new HashSet();
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                char number = board[i][j];
                if(number!='.')
                {
                    if(!seen.add(number+"in row"+i)||
                       !seen.add(number+"in column"+j)||
                       !seen.add(number+"in box"+i/3+"-"+j/3))
                        return false;
                }
            }
        }
        return true;
    }
}