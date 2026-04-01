class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int maxrow=0;   //to track which row
        int maxcnt=0; //no.of ones
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=0;j<m;j++){
              if(mat[i][j]==1){
                cnt++;
              }
            }
            if(cnt>maxcnt){
                maxcnt=cnt;
                maxrow=i;
            }
        }
        return new int[]{maxrow,maxcnt};
    }
}