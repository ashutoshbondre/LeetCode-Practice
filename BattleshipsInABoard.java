class Solution {
    public int countBattleships(char[][] board) {
        int row = board.length;
        int col = board[0].length;
        int count =0;
        for(int r=0; r<row;r++)
        {
            for(int c=0;c<col;c++)
            {
                if(board[r][c]=='.') continue;
                if(r>0 && board[r-1][c]=='X') continue;
                if(c>0 && board[r][c-1]=='X') continue;
                count++;
            }
        }
        return count;
    }
}