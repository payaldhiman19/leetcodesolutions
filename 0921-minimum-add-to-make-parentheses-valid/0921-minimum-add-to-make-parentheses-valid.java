class Solution {
    public int minAddToMakeValid(String s) {
     Stack<Character>st=new Stack<>();
     int cnt=0;
     for(char ch:s.toCharArray()){
        if(ch=='('){
            st.push(ch);
        }else{
            if(!st.isEmpty()&&st.peek()=='('){
                st.pop();
            }else{
                cnt++;
            }
        }
     }
     return st.size()+cnt;
    }
}