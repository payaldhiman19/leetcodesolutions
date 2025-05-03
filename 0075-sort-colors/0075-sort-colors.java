class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int onecnt=0;
        int twocnt=0;
        int zerocnt=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                zerocnt++;
            }else if(nums[i]==1){
                onecnt++;
            }else{
                twocnt++;
            }
        }
       int index=0;
       while(zerocnt>0){
        nums[index++]=0;
        zerocnt--;
       }
       while(onecnt>0){
        nums[index++]=1;
        onecnt--;
       }
       while(twocnt>0){
        nums[index++]=2;
        twocnt--;
       }
    }
}