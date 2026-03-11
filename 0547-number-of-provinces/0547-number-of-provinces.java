
class Solution {
    public void dfs(int [][]arr,boolean vis[],int node){
        int n=arr.length;
        vis[node]=true;
        for(int i=0;i<n;i++){
            if(arr[node][i]==1&&!vis[i]){
                dfs(arr,vis,i);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int cnt=0;
        boolean vis[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                dfs(isConnected,vis,i);
                cnt++;
            }
        }
        return cnt;
    }
}