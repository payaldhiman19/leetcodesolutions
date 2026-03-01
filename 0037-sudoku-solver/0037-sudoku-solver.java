class Solution {
    public boolean issafe(char [][]board,int row,int col,int num){
     for(int i=0;i<9;i++){
        if(board[i][col]==num||board[row][i]==num){
            return false;
        }
     }
     int nrow=row-row%3;
     int ncol=col-col%3;
     for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            if(board[i+nrow][j+ncol]==num){
                return false;
            }
        }
     }
     return true;
    }
    public boolean solve(char[][]board){
        for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){
                if(board[row][col]=='.'){
                  for(char num='1';num<='9';num++){
                  if(issafe(board,row,col,num)){
                    board[row][col]=num;
                    if(solve(board)){
                      return true;
                    }
                  board[row][col]='.';
                  }
                }
                return false;
            }
        }
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        solve(board);
    }
}