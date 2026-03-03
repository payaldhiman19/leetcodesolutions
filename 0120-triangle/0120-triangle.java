class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int dp[][]=new int[n][n];
        dp[0][0]=triangle.get(0).get(0); //first element --2
        for(int i=1;i<n;i++){
            for(int j=0;j<=i;j++){
                int val=triangle.get(i).get(j);
                //first element
                if(j==0){
                    dp[i][j]=dp[i-1][j]+val;
                }else if(j==i){
                    //last element
                    dp[i][j]=dp[i-1][j-1]+val;
                }else{
                    //middle element
                    dp[i][j]=Math.min(dp[i-1][j],dp[i-1][j-1])+val;
                }
            }
        }
    //last row se minimum nikalo
    int ans=dp[n-1][0];
    for(int i=1;i<n;i++){
        ans=Math.min(ans,dp[n-1][i]);
    }
    return ans;
    }
}