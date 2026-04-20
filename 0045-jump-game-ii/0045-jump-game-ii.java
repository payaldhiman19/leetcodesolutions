class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int far=0;   //farthest we can reach in next jump
        int currend=0;  //currEnd → end of current jump range
        int jumps=0;
       for(int i=0;i<n-1;i++){
        far=Math.max(far,i+nums[i]);
        if(i==currend){
            jumps++;
            currend=far;
        }
       }
       return jumps;
    }
}