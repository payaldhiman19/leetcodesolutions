class Solution {
     public int f(int []coins,int amt,int idx,int [][]dp){
     if(amt<0 ||idx<0) return 0;
     if(amt==0) return 1;
     if(dp[idx][amt]!=-1) return dp[idx][amt]; 
     int take=f(coins,amt-coins[idx],idx,dp);
     int nottake=f(coins,amt,idx-1,dp);
     return dp[idx][amt]=take+nottake;
    }
    public int change(int amount, int[] coins) {
        int n=coins.length;
           int dp[][]=new int[n][amount+1];
    for(int[]a:dp){
        Arrays.fill(a,-1);
    }
    return f(coins,amount,n-1,dp);
    }
}