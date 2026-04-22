class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int cntodd=0;
        int res=0;
        for(int num:nums){
            if(num%2!=0){
                cntodd++;
            }
            if(map.containsKey(cntodd-k)){
                res+=map.get(cntodd-k);
            }
                map.put(cntodd,map.getOrDefault(cntodd,0)+1);
            
        }
        return res;
    }
}