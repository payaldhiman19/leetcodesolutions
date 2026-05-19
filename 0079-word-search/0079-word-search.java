class Solution {
    public boolean solve(char[][]board,String word,int index,int i,int j,int vis[][]){
        if(index==word.length()){
            return true;
        }
        if(i<0||j<0||i>=board.length||j>=board[0].length||vis[i][j]==1||board[i][j]!=word.charAt(index)){
            return false;
        }
        vis[i][j]=1;
        boolean found=solve(board,word,index+1,i+1,j,vis)||
        solve(board,word,index+1,i-1,j,vis)||
        solve(board,word,index+1,i,j+1,vis)||
        solve(board,word,index+1,i,j-1,vis);
        vis[i][j]=0;
        return found;
    }
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        int vis[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==word.charAt(0)){
                    if(solve(board,word,0,i,j,vis)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}