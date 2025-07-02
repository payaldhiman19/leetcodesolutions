class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n =heights.length;
     int []ans=new int[n];   
       Stack<Integer>st=new Stack<>();
       st.push(heights[n-1]);
       ans[n-1]=0;
       for(int i=n-2;i>=0;i--){
         int cnt=0;
        while(!st.isEmpty() && st.peek()<heights[i]){
         //if st element is smaller than current element then cnt++ and pop also
           cnt++;
          st.pop();
        }
        if(!st.isEmpty()){
            cnt++;
        }
        ans[i]=cnt;
        st.push(heights[i]);
       }
       return ans;
    }
}