class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Map.Entry<Character,Integer>>maxheap=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        //sort characters by frequency 
        StringBuilder res=new StringBuilder();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
    maxheap.add(entry);
}
   while(!maxheap.isEmpty()){
    Map.Entry<Character,Integer>entry=maxheap.poll();
    char ch=entry.getKey();
    int freq=entry.getValue();
    for(int i=0;i<freq;i++){
        res.append(ch);
    }
   }
   return res.toString();
    }
}