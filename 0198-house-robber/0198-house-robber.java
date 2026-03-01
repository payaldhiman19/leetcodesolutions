class Solution {
    public int helper(int arr[],int index,int dp[]){
        if(index<0)return 0;
        if(index==0)return arr[0];
        if(dp[index]!=-1)return dp[index];
        return dp[index]=Math.max(arr[index]+helper(arr,index-2,dp),helper(arr,index-1,dp));
    }
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        return helper(nums,n-1,dp);
    }
}