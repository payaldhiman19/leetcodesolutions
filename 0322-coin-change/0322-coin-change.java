class Solution {
    public int f(int []coins,int amt,int idx,int [][]dp){
     if(amt<0 ||idx<0) return Integer.MAX_VALUE;
     if(amt==0) return 0;
     if(dp[idx][amt]!=-1) return dp[idx][amt];
     int take=Integer.MAX_VALUE;
     if(coins[idx]<=amt){
        int temp=f(coins,amt-coins[idx],idx,dp);
           if(temp!=Integer.MAX_VALUE){
            take=1+temp;//we are taking first coin soadd 1 and can add how many times we want
        }
     }
     int nottake=f(coins,amt,idx-1,dp);
     return dp[idx][amt]=Math.min(take,nottake);
    }
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
    int dp[][]=new int[n+1][amount+1];
    for(int[]a:dp){
        Arrays.fill(a,-1);
    }
    int res=f(coins,amount,n-1,dp);
    return res==Integer.MAX_VALUE?-1:res;
    }
}