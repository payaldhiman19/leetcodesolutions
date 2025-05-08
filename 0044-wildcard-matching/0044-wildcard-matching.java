class Solution {
    public boolean helper(String s,String t,int i,int j,Boolean dp[][]){
        //base case: if all are processed
        if(i<0&&j<0){
            return true;
        }
        //if text is still there
        if(j<0) return false;
        if(i<0){
                       // Remaining pattern should be all '*'

for(int k=0;k<=j;k++){
    if(t.charAt(k)!='*')
    return false;
}
return true;   //if * is present it can match any multiple character
        }
          if (dp[i][j] != null) return dp[i][j];
        char tc=s.charAt(i);
       char pc=t.charAt(j);
       if(pc=='*'){
        //mathes muitiple charactes
        dp[i][j]=helper(s,t,i-1,j,dp) ||helper(s,t,i,j-1,dp);
       }else if(pc==tc || pc=='?'){
        //matxches characters one by one then move i and j pointer
        dp[i][j]=helper(s,t,i-1,j-1,dp);
       }else{
        dp[i][j]=false;
       }
       return dp[i][j];
    }
    public boolean isMatch(String s, String p) {
        int m=s.length();
        int n=p.length();
        Boolean [][]dp=new  Boolean[m][n];
      return helper(s,p,m-1,n-1,dp);
}
}