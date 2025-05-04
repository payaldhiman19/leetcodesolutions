class Solution {

    public String shortestCommonSupersequence(String str1, String str2) {
       //whenever we get the  same character from both the strings we will use one character only
       int m=str1.length();
       int n=str2.length();
       int[][]dp=new int[m+1][n+1];
       for(int i=1;i<=m;i++){
        for(int j=1;j<=n;j++){
            if(str1.charAt(i-1)==str2.charAt(j-1)){
                dp[i][j]=1+dp[i-1][j-1];
            }else{
                //max from top,left
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
       }
        //step 2:build scs frokm lcs table
        StringBuilder sb=new StringBuilder();
        int i=m,j=n;
        while(i>0&&j>0){
            if(str1.charAt(i-1)==str2.charAt(j-1)){
                //same character add once
                sb.append(str1.charAt(i-1));
                i--;j--;
            }else  if(dp[i-1][j]>dp[i][j-1]){
                sb.append(str1.charAt(i-1));
                i--;
            }else{
                sb.append(str2.charAt(j-1));
                j--;
            }
        }
        //add remaijing that are left over after adding evrthing
        while(i>0){
            sb.append(str1.charAt(i-1));
            i--;
        }
        while(j>0){
            sb.append(str2.charAt(j-1));
            j--;
        }
       return sb.reverse().toString();
    }
}