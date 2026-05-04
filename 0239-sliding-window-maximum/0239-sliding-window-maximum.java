class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        if(n==0)return new int[0];
        int res[]=new int[n-k+1];
        Deque<Integer>dq=new ArrayDeque<>();
        int index=0;
        for(int i=0;i<n;i++){
          while(!dq.isEmpty()&&dq.peekFirst()==i-k){
            //out of window
            dq.pollFirst();
          }
          //if smaller than current remove from last as there is no use then
          while(!dq.isEmpty()&&nums[i]>nums[dq.peekLast()]){
            dq.pollLast();
          }
          dq.offerLast(i);
          //if window complete
          if(i>=k-1){
            res[index++]=nums[dq.peekFirst()];
          }
        }
        return res;
    }
}