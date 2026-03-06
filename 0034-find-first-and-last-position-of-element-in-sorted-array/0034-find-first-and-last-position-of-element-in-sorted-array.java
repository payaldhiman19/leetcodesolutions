class Solution {
    public int first(int nums[],int target){
        int ans=-1;
        int left=0;int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                ans=mid;
                right=mid-1;
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return ans;
    }
    public int second(int nums[],int target){
        int ans=-1;
        int left=0;int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                ans=mid;
                left=mid+1;
            }else if(nums[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int res[]=new int[2];
        res[0]=first(nums,target);
        res[1]=second(nums,target);
        return res;
    }
}