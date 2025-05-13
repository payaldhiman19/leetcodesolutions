class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
       //find the shortest subarray whose sum is equak to or greater than target
       int minlength=Integer.MAX_VALUE;
       int left=0;
       int windowsum=0;
       for(int right=0;right<nums.length;right++){
        windowsum+=nums[right];
// If sum >= target, try to shrink the window
        while(windowsum>=target){
            minlength=Math.min(minlength,right-left+1);
           windowsum-=nums[left];
           left++;
        }
       }
       return minlength==Integer.MAX_VALUE?0:minlength; 
    }
}