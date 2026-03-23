class Solution {
    public int maxArea(int[] height) {
      int n=height.length;
     int maxarea=0;
     int left=0;int right=n-1;
       while(left<right){
        int h=Math.min(height[left],height[right]);
        int w=(right-left);
        int area=w*h;
        maxarea=Math.max(area,maxarea);
        if(height[left]<height[right]){
            left++;
        }else{
            right--;
        }
       }
       return maxarea;
    }
}