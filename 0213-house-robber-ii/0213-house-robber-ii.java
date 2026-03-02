class Solution {
    public int helper(int nums[]){
        int n=nums.length;
        if(n==0)return nums[0];
        if(n==1)return Math.max(nums[0],nums[1]);
        int dp[]=new int[n];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++){
            dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        return dp[n-1];
    }
    public int rob(int[] nums) {
      int n=nums.length;
      if(n==1)return nums[0];
      if(n==2)return Math.max(nums[0],nums[1]);
      int arr1[]=new int[n];
      int arr2[]=new int[n];
      //skip last
      for(int i=0;i<n-1;i++){
        arr1[i]=nums[i];
      }  
      //skip first
      for(int i=1;i<n;i++){
        arr2[i-1]=nums[i];
      }
      int one=helper(arr1);
      int sec=helper(arr2);
      return Math.max(one,sec);
    }
}