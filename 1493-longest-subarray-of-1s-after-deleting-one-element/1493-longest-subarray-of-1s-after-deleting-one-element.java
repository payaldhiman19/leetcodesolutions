class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
         int left=0;int maxlength=0;
         int zerocnt=0;
         for(int right=0;right<n;right++){
            if(nums[right]==0){
                zerocnt++;
            }
            while(zerocnt>1){
                if(nums[left]==0){
                zerocnt--;
            }
            //if no zero move forward
            left++;
         }
         maxlength=Math.max(maxlength,right-left);
         }
         return maxlength;
    }
}