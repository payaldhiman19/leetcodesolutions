class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character>st=new Stack<>();
        for(char ch:num.toCharArray()){
            while(!st.isEmpty() && k>0 &&ch<st.peek()){
                st.pop();
                k--;
            }
            st.push(ch);
        }
        while(!st.isEmpty() && k>0){
            st.pop();
            k--;
        }
        StringBuilder ans=new StringBuilder();
        for(char ch:st){
            ans.append(ch);
        }
        while(ans.length()>0 &&ans.charAt(0)=='0'){
            ans.deleteCharAt(0);
        }
        return ans.length()==0?"0":ans.toString();
    }
}