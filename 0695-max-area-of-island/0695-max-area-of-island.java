class Solution {
    public int dfs(int[][]grid,int row,int col,int vis[][]){
        int n=grid.length;
        int m=grid[0].length;
        int area=1;
        vis[row][col]=1;
        int delrow[]={-1,0,1,0};
        int delcol[]={0,1,0,-1};
        for(int i=0;i<4;i++){
            int nrow=delrow[i]+row;
            int ncol=delcol[i]+col;
            if(nrow<n&&ncol<m&&nrow>=0&&ncol>=0&&grid[nrow][ncol]==1 &&vis[nrow][ncol]==0){
                area+=dfs(grid,nrow,ncol,vis);
            }
        }
        return area;
    }
    public int maxAreaOfIsland(int[][] grid) {
         int n=grid.length;
        int m=grid[0].length;
        int vis[][]=new int[n][m];
        int maxarea=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 &&vis[i][j]==0){
                  int area=  dfs(grid,i,j,vis);
                  maxarea=Math.max(area,maxarea);
                }
            }
        }
        return maxarea;
    }
}