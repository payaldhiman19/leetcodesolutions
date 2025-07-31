class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
      int n=obstacleGrid.length;
        int m=obstacleGrid[0].length;
        int dp[][]=new int[n][m];
        for(int i=0;i<n;i++){
            if(obstacleGrid[i][0]==1)
            break;//it's obstacle
            dp[i][0]=1;
        } 
        for(int j=0;j<m;j++){
            if(obstacleGrid[0][j]==1)break;
            //gain it's obstacle
            dp[0][j]=1;
        }
        //now the ways to reach the destination
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(obstacleGrid[i][j]==1){
                    dp[i][j]=0;//if its again obstacle make the ways to rach 0
                }else{
                    //find the paths  right and down
                    dp[i][j]=dp[i][j-1]+dp[i-1][j];
                }
            }
        }
        return dp[n-1][m-1];
    }
}