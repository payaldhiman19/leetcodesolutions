class Solution {
    public void dfs(int arr[][],int node,boolean vis[]){
        vis[node]=true;
        for(int i=0;i<arr.length;i++){
            if(arr[node][i]==1&&!vis[i]){
                dfs(arr,i,vis);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean vis[]=new boolean[n];
        int cnt=0;
        for(int i=0;i<n;i++){
            if(!vis[i]){
                cnt++;
                dfs(isConnected,i,vis);
            }
        }
        return cnt;
    }
}