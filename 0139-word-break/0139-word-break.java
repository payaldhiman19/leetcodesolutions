class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String>setword=new HashSet<>(wordDict);
        //worddict me add karo
        int n=s.length();
        boolean dp[]=new boolean[n+1];
        dp[0]=true;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                if(dp[j]&&setword.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[n];
    }
}