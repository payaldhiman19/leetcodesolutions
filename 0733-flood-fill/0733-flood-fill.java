class Solution {
        public void dfs(int[][] image, int sr, int sc, int newcolor,int vis[][],int inicolor){
            int n=image.length;
        int m=image[0].length;
        vis[sr][sc]=1;
        image[sr][sc]=newcolor;
        int delrow[]={-1,0,+1,0};
        int delcol[]={0,+1,0,-1};
        for(int i=0;i<4;i++){
            int nrow=delrow[i]+sr;
            int ncol=delcol[i]+sc;
            if(nrow>=0&&ncol>=0 &&ncol<m&&nrow<n&&vis[nrow][ncol]==0 &&image[nrow][ncol]==inicolor){
                dfs(image,nrow,ncol,newcolor,vis,inicolor);
            }
        }
        }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n=image.length;
        int m=image[0].length;
        int inicolor=image[sr][sc];
        if(inicolor==color){
            return image;
        }
        int vis[][]=new int[n][m];
        dfs(image,sr,sc,color,vis,inicolor);
        return image;
    }
}