class Solution {
    public int f(int arr[],int amount,int index,int[] []dp){
        if(amount<0 ||index<0) return Integer.MAX_VALUE;
        if(amount==0) return 0;
        if(dp[index][amount]!=-1) return dp[index][amount];
        int take=Integer.MAX_VALUE;
        if(arr[index]<=amount){
         int   temp=f(arr,amount-arr[index],index,dp);
        if(temp!=Integer.MAX_VALUE){
            take=1+temp;//we are taking first coin soadd 1 and can add how many times we want
        }
        }
        int notake=f(arr,amount,index-1,dp); //addd next coin
       return dp[index][amount]=Math.min(take,notake);
    }
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int [][]dp=new int[n][amount+1];
          for (int[] row : dp) Arrays.fill(row, -1);
          int res=f(coins,amount,n-1,dp);
             return res == Integer.MAX_VALUE ? -1 : res;
    }
}