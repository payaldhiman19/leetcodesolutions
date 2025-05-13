class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start =0; 
        int windowsum=0;
        int minlen=Integer.MAX_VALUE;
        for(int end=0;end<nums.length;end++){
            windowsum+=nums[end];
            //if windowsum becomes greater than sum then first find mnlen of that and shrink from left
            //remove one by one element from left
            while(windowsum>=target){
            minlen=Math.min(minlen,end-start+1);
             windowsum-=nums[start];
            start++;
            }
        }
        return minlen==Integer.MAX_VALUE?0:minlen;
    }
}