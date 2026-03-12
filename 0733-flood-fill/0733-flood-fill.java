class Solution {
    public void dfs(int[][]image,int i,int j,int oldcolor,int newcolor){
        if(i<0||j<0||i>=image.length||j>=image[0].length){
            return;
        }
        if(image[i][j]!=oldcolor){
            return;
        }
        //mark as new color
        image[i][j]=newcolor;
        dfs(image,i+1,j,oldcolor,newcolor);
        dfs(image,i-1,j,oldcolor,newcolor);
        dfs(image,i,j+1,oldcolor,newcolor);
        dfs(image,i,j-1,oldcolor,newcolor);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldcol=image[sr][sc];
        if(oldcol==color)return image;
        dfs(image,sr,sc,oldcol,color);
        return image;
    }
}