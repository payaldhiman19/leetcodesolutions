class Solution {
    public int maxSubarraySumCircular(int[] nums) {
      int n=nums.length;
        int maxsum=nums[0];
        int currsum=0;
        int minsum=nums[0];
        int currmin=0;
        int sum=0;
        for(int num:nums){
            currsum=Math.max(currsum+num,num);
            maxsum=Math.max(maxsum,currsum);
            currmin=Math.min(num,currmin+num);
            minsum=Math.min(minsum,currmin);
            sum+=num;
        }
         if(maxsum<0){
            return maxsum;
         }
         return Math.max(maxsum,sum-minsum);
    }
}