class Solution {
    public int numberOfSteps(int num) {
     int steps=0;
     while(num>0){
        if(num%2==0){
            //if even just divide by zero else subtract with 1 gto makde it even and count steps
            num=num/2;
        }else{
            num=num-1;
        }
        steps++;
     }   
     return steps;
    }
}