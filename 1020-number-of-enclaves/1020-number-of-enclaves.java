class Solution {
    public void dfs(int[][]arr,int i,int j,int n,int m){
        if(i<0 ||j<0 || i>=n ||j>=m ||arr[i][j]==0)return;
        arr[i][j]=0;
        dfs(arr,i+1,j,n,m);
        dfs(arr,i,j-1,n,m);
        dfs(arr,i,j+1,n,m);
        dfs(arr,i-1,j,n,m);
    }
    public int numEnclaves(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;
        int cnt=0;
        for(int j=0;j<m;j++){
            if(arr[0][j]==1)dfs(arr,0,j,n,m);
            if(arr[n-1][j]==1)dfs(arr,n-1,j,n,m);
        }
        for(int i=0;i<n;i++){
            if(arr[i][0]==1)dfs(arr,i,0,n,m);
            if(arr[i][m-1]==1)dfs(arr,i,m-1,n,m);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==1){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}