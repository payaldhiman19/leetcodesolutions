class Solution {
    public int findMaxLength(int[] nums) {
        int maxlen=0;int sum=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        //0 to -1 qand if becomes 0 means balanced
        for(int i=0;i<nums.length;i++){
            sum+=(nums[i]==0)?-1:1;
            if(sum==0){
                maxlen=i+1;
            }
            if(map.containsKey(sum)){
                maxlen=Math.max(maxlen,i-map.get(sum));
            }else{
                map.put(sum,i);
            }
        }
        return maxlen;
    }
}