class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        for(int i=0;i<n;i++){
            dp[i]=1;//initailze with 1
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                dp[i]=Math.max(dp[i],dp[j]+1);
            }
            }
        }
        int ans=0;
        for(int res:dp){
            ans=Math.max(res,ans);
        }
        return ans;
    }
}