class Solution {
     public void dfs(char[][]board,int row,int col,int vis[][]){
        int n=board.length;
        int m=board[0].length;
        vis[row][col]=1;
        //check directions
        int delrow[]={-1,0,+1,0};
        int delcol[]={0,+1,0,-1};
        for(int d=0;d<4;d++){
            int nrow=delrow[d]+row;
            int ncol=delcol[d]+col;
    if(nrow>=0 &&ncol>=0&&nrow<n&&ncol<m&&vis[nrow][ncol]==0 &&board[nrow][ncol]=='O'){
                dfs(board,nrow,ncol,vis);
            }
        }
    }
    public void solve(char[][] board) {
        if(board.length==0 ||board==null){
            return ;
        }
        int n=board.length;
        int m=board[0].length;
        int vis[][]=new int[n][m];
        for(int j=0;j<m;j++){
            if(vis[0][j]==0&&board[0][j]=='O'){
                dfs(board,0,j,vis);
            }
        }
        for(int j=0;j<m;j++){
            if(vis[n-1][j]==0&&board[n-1][j]=='O'){
                dfs(board,n-1,j,vis);
            }
        }
        for(int i=0;i<n;i++){
            if(vis[i][0]==0&&board[i][0]=='O'){
                dfs(board,i,0,vis);
            }
        }
         for(int i=0;i<n;i++){
            if(vis[i][m-1]==0&&board[i][m-1]=='O'){
                dfs(board,i,m-1,vis);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==0 &&board[i][j]=='O'){
                    board[i][j]='X';
                }
            }
        }
    }
}