class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int res[]=new int[n*m];
        boolean up=true;
        int row=0;int col=0;
        for(int i=0;i<n*m;i++){
            res[i]=mat[row][col];
            //up-right
            if(up){
                //col end so go down--will go 
                if(col==m-1){
                    //go down
                    row++;
                    up=false;
                }else if(row==0){
                    //right
                    col++;
                    up=false;
                }else{
                  row--;col++;
                }
            }else{
                //row end --go left and will to down
                //down-left
                if(row==n-1){
                    //go left
                    col++;
                    up=true;
                }else if(col==0){
                    //go down
                    row++;
                    up=true;
                }else{
                    row++;col--;
                }
            }
        }
        return res;
    }
}