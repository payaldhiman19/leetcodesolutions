class Solution {
    public boolean safe(boolean b[][],int n,int row,int col){
     for(int i=0;i<row;i++){
        if(b[i][col])return false;
     }
     for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
        if(b[i][j])return false;
     }
     for(int i=row-1,j=col+1;i>=0&&j<n;i--,j++){
        if(b[i][j])return false;
     }
     return true;
    }
    public void solve(boolean b[][],int row,int n,List<List<String>>ans){
        if(row==n){
            ans.add(printboard(b));
            return;
        }
        for(int col=0;col<n;col++){
            if(safe(b,n,row,col)){
         b[row][col]=true;
         solve(b,row+1,n,ans);
         b[row][col]=false;
        }
        }
    }
    public List<String>printboard(boolean b[][]){
        List<String>res=new ArrayList<>();
        for(int i=0;i<b.length;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<b[0].length;j++){
                if(b[i][j]){
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
        boolean b[][]=new boolean[n][n];
        solve(b,0,n,ans);
        return ans;
    }
}