class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    int n=nums.length;
   //iterate the frequency of map and find the highest frequency element
   HashMap<Integer,Integer>map=new HashMap<>();
   for(int num:nums){
    map.put(num,map.getOrDefault(num,0)+1); //frequency 
   }
    //convert map keys to list and sort by frequency
    List<Integer>list=new ArrayList<>(map.keySet());
    list.sort((a,b)->map.get(b)-map.get(a));
    //pick up the top k element
    int []res=new int[k];
    for(int i=0;i<k;i++){
        res[i]=list.get(i);
    }
    return res;
    }
}