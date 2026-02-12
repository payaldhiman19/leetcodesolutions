class Solution {
    public int[] getConcatenation(int[] nums) {
       int ans []=new int[2*nums.length];
              for(int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];       // first copy
            ans[i + nums.length] = nums[i];   // second copy
        }

        return ans;


    }
}