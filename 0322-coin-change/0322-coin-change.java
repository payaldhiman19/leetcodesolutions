class Solution {
    public int coinChange(int[] c, int amount) {
        int n=c.length;
        int dp[]=new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;
        if(amount==0)return 0;
        for(int i=1;i<=amount;i++){
            for(int ci:c){
                if(i>=ci){
                    dp[i]=Math.min(dp[i],dp[i-ci]+1);
                }
            }
        }
        return dp[amount]>amount?-1:dp[amount];
    }
}