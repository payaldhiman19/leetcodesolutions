class Solution {
    public int minDistance(String word1, String word2) {
       int n=word1.length();
       int m=word2.length();
       int dp[][]=new int[n+1][m+1];
      for(int i=0;i<=n;i++)dp[i][0]=i;
      for(int j=0;j<=m;j++) dp[0][j]=j;
      for(int  i=1;i<=n;i++){
        for(int j=1;j<=m;j++){
        //if characters are same 
        if(word1.charAt(i-1)==word2.charAt(j-1)){
            dp[i][j]=dp[i-1][j-1];
        }else{
            //if not then check top left diagonal
            int insert=dp[i-1][j];
            int delete=dp[i][j-1];
            int replace=dp[i-1][j-1];
            dp[i][j]=1+Math.min(insert,Math.min(replace,delete));
        }
        }
      }
    return dp[n][m];
}
}