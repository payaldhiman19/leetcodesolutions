class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;int m=mat[0].length;
        int dist[][]=new int[n][m];
        Queue<int[]>q=new LinkedList<>();
        for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
            if(mat[i][j]==0){
                q.add(new int[]{i,j});
            }else{
                dist[i][j]=Integer.MAX_VALUE;
            }
           }
        }
       int dr[]={-1,0,1,0};
       int dl[]={0,1,0,-1};
       while(!q.isEmpty()){
        int curr[]=q.poll();
        int r=curr[0];
        int c=curr[1];
       for(int k=0;k<4;k++){
        int nrow=dr[k]+r;
        int ncol=dl[k]+c;
        if(nrow>=0&&ncol>=0&&nrow<n&&ncol<m){
            if(dist[nrow][ncol]>dist[r][c]+1){
                dist[nrow][ncol]=dist[r][c]+1;
                q.add(new int[]{nrow,ncol});
            }
        }
       }
    }
    return dist;
    }
}