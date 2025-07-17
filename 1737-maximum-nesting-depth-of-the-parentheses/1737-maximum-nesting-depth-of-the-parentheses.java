class Solution {
    public int maxDepth(String s) {
     int n=s.length();
     int maxcnt=0;
     int cnt=0;
     for(int i=0;i<n;i++){
       char ch=s.charAt(i);
       if(ch=='('){
        cnt++;
        maxcnt=Math.max(cnt,maxcnt);
       }else if(ch==')'){
        cnt--;
       }
     }
     return maxcnt;
    }
}