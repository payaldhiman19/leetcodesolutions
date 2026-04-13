class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int minlen=Integer.MAX_VALUE;
        int start=0;int windowsum=0;
        for(int right=0;right<n;right++){
        windowsum+=nums[right];
        while(windowsum>=target){
            minlen=Math.min(minlen,right-start+1);
            windowsum-=nums[start];
            start++;
        }
        }
        return minlen==Integer.MAX_VALUE?0:minlen;
    }
}