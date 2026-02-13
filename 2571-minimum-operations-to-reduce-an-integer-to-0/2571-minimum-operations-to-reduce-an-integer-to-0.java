class Solution {
    public int minOperations(int n) {
      // so here we need to find how many power of 2 can lead to zero either by adding or subtracting
      //if n-power of 2   like 32---just direcr subtract
      //if n is even divide by 2
      //if odd subtract one and add 1
      int cnt=0;
      while(n>0){
        //id poer of 2
        if((n&(n-1))==0){
            cnt++;
            break;
        }
        //if even move to next bit
        if(n%2==0){
            n=n/2;
        }else{
            //odd
            if(n==3 ||n%4==1){
                n=n-1; //subtract
            }else{
                //add bit then subtract
                n=n+1;
            }
            cnt++;
        }
      } 
      return cnt;
    }
}