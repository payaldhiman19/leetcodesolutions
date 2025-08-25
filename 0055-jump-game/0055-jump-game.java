class Solution {
    public boolean helper(int arr[],int idx,Boolean dp[]){
        if(idx==arr.length-1){
            return true;
        }
        if(arr.length<=idx){
            return false;
        }
        if(dp[idx]!=null){
            return dp[idx];
        }
        int steps=arr[idx];
        for(int i=1;i<=steps;i++){
            if(helper(arr,idx+i,dp)) return dp[idx]= true;
        }
      return   dp[idx]= false;
    }
    public boolean canJump(int[] nums) {
        int n=nums.length;
        Boolean dp[]=new Boolean[n];
     return helper(nums,0,dp);
    }
}