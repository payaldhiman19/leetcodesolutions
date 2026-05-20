class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
       //kadane's means we have to add to make maximum subarray 
       int csum=nums[0];
       int msum=nums[0];
       for(int i=1;i<n;i++){
        csum=Math.max(nums[i],nums[i]+csum);
        msum=Math.max(msum,csum);
       }
       return msum;
        }
}