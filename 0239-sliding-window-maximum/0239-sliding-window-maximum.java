class Solution {
    public int[] nge(int nums[]){
        int n=nums.length;
        int res[]=new int[n];
        Stack<Integer>st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() &&nums[st.peek()]<=nums[i]){
                st.pop();
            }
            if(st.isEmpty()) res[i]=n;
            else res[i]=st.peek();
            st.push(i);
        }
        return res;
    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int ans[]=new int [n-k+1];
        int nges[]=nge(nums);
        int j=0;
        for(int i=0;i<=n-k;i++){
            //make sure j is within the window
            if(j<i) j=i;
            //jump to next greater elemnt and if the index is wothin the window then it is correct
            while(nges[j]<i+k){
                //to check if it is in range
                j=nges[j]; //store index of next greater elemnt
            }
            //nums of j is maximum in window
            ans[i]=nums[j];
        }
        return ans;
    }
}