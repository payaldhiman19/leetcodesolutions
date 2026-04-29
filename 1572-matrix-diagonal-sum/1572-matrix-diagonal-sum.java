class Solution {
    public int diagonalSum(int[][] mat) {
     int n=mat.length;
     int sum=0;
     for(int i=0;i<n;i++){
        sum+=mat[i][i];  //primary from top left to bottom right
        sum+=mat[i][n-1-i]; //secondary -- from top right to bottom left
     }
     //middle elemnet twice remove one
     if(n%2==1){
        sum-=mat[n/2][n/2];
     }
     return sum;
    }
}