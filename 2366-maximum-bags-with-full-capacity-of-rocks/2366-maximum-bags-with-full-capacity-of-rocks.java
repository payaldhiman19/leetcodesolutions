class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
       int n=capacity.length;
       int cnt=0;
       int need[]=new int[n];
       for(int i=0;i<n;i++){
        need[i]=capacity[i]-rocks[i];
       } 
       Arrays.sort(need);
       for(int arr:need){
        if(arr==0){
            cnt++;
        }else if(arr<=additionalRocks){
            additionalRocks-=arr;
            cnt++;
        }else{
            break;
        }
       }
       return cnt;
    }
}