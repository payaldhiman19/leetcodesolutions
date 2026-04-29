class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        //greedy question 
        //just check if left and neighbour is present if nor treat it as 0 and if lecft and right is 0 place the flower and decrement n 
        for(int i=0;i<flowerbed.length;i++){
        if(flowerbed[i]==0){
            int left=(i==0)?0:flowerbed[i-1];
            int right=(i==flowerbed.length-1)?0:flowerbed[i+1];
            if(left==0&&right==0){
                flowerbed[i]=1;
                n--;
            }
        }
        }
        return n<=0;
    }
}