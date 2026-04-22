class Solution {
    public void helper(String s,int n,int open ,int close,List<String>ans){
        if(s.length()==2*n){
            ans.add(s);
            return;
        }
        if(open<n){
            helper(s+'(',n,open+1,close,ans);
        }
        if(close<open){
            helper(s+')',n,open,close+1,ans);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String>ans=new ArrayList<>();
        helper("",n,0,0,ans);
        return ans;
    }
}