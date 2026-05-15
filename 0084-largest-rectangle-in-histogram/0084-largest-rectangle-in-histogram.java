class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
       Stack<Integer>st=new Stack<>();
       int pse[]=new int[n];
       int nse[]=new int[n];
       for(int i=0;i<n;i++){
        while(!st.isEmpty()&&heights[i]<=heights[st.peek()]){
            st.pop();
        }
        pse[i]=st.isEmpty()?-1:st.peek();
        st.push(i);
       }
       st.clear();
       for(int i=n-1;i>=0;i--){
        while(!st.isEmpty()&&heights[i]<=heights[st.peek()]){
            st.pop();
        }
        nse[i]=st.isEmpty()?n:st.peek();
        st.push(i);
       }
       int maxarea=0;
       for(int i=0;i<n;i++){
        int width=nse[i]-pse[i]-1;
        int height=heights[i];
        int area=width*height;
        maxarea=Math.max(maxarea,area);
       }
       return maxarea;
    }
}