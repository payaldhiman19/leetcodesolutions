class Solution {
    public int[] singleNumber(int[] nums) {
        int n=nums.length;
        int res=0;
        for(int num:nums){
            res^=num;
        }
        int rightmost=res&-res;
        int a=0;int b=0;
        for(int num:nums){
            if((num&rightmost)!=0)
            a^=num;
            else
            b^=num;
        }
        return new int[] {a,b};
    }
}