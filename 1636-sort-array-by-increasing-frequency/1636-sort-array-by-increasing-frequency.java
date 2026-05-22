class Solution {
    public int[] frequencySort(int[] nums) {
     int n=nums.length;
     HashMap<Integer,Integer>map=new HashMap<>();
     for(int num:nums){
        map.put(num,map.getOrDefault(num,0)+1);
     }
     PriorityQueue<Map.Entry<Integer,Integer>>pq=new PriorityQueue<>((a,b)->{
        if(!a.getValue().equals(b.getValue())){
            return a.getValue()-b.getValue();
        }
        return b.getKey()-a.getKey();
     });
     pq.addAll(map.entrySet());
     int res[]=new int[n];
     int index=0;
     while(!pq.isEmpty()){
        Map.Entry<Integer,Integer>entry=pq.poll();
        int ele=entry.getKey();
        int fre=entry.getValue();
        for(int i=0;i<fre;i++){
            res[index++]=ele;
        }
     }
     return res;
    }
}