class Solution {
    public boolean issafe(boolean board[][],int row,int col,int n){
        for(int i=0;i<row;i++){
            if(board[i][col])return false;
        }
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j])return false;
        }
        for(int i=row-1,j=col+1;i>=0&&j<n;i--,j++){
            if(board[i][j])return false;
        }
        return true;
    }
    public void solve(boolean board[][],int row,int n,List<List<String>>ans){
        if(row==n){
            ans.add(printboard(board));
            return;
        }
        for(int col=0;col<n;col++){
            if(issafe(board,row,col,n)){
                board[row][col]=true;
            solve(board,row+1,n,ans);
                board[row][col]=false;//backtrack
            }
        }
    }
    public List<String>printboard(boolean board[][]){
        List<String>res=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]){
                    sb.append('Q');
                }else{
                    sb.append('.');
                }
            }
            res.add(sb.toString());
        }
        return res;
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>>ans=new ArrayList<>();
        boolean board[][]=new boolean[n][n];
        solve(board,0,n,ans);
        return ans;
    }
}