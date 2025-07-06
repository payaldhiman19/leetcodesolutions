class Solution {
    public int sumSubarrayMins(int[] arr) {
      int n=arr.length;
      int mod = (int)1e9 + 7;
      int []pse=new int[n];
      int []nse=new int[n];
      Stack<Integer>st=new Stack<>();
      for(int i=0;i<n;i++){
        while(!st.isEmpty() &&arr[st.peek()]>arr[i]){
            st.pop();
        }
        pse[i]=st.isEmpty()?-1:st.peek();
        st.push(i);
      }
      st.clear();  
      //next smaller element
      for(int i=n-1;i>=0;i--){
         while(!st.isEmpty() &&arr[st.peek()]>=arr[i]){
            st.pop();
         }
         nse[i]=st.isEmpty()?n:st.peek();
         st.push(i);
      }
      long sum=0;
      for(int i=0;i<n;i++){
        long left=i-pse[i];
        long right=nse[i]-i;
         sum=(sum+(arr[i]*left*right)%mod)%mod;
      }
      return (int)sum;
    }
}