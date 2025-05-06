class Solution {
    public boolean isAnagram(String s, String t) {
    //  HashMap<Character,Integer>map=new HashMap<>();
    // if(s.length()!=t.length()){
    //     return false;
    // }
    //  for(char ch:s.toCharArray()){
    //     map.put(ch,map.getOrDefault(ch,0)+1);
    //  }
    //  for(char ch:t.toCharArray()){
    //     if(!map.containsKey(ch)){
    //         return false; 
    //     }
    //     map.put(ch,map.get(ch)-1);   //decrease the character count
    //     if(map.get(ch)==0){
    //         map.remove(ch); //if count becomes zero remove it from map;
    //     }
    //  }
    //  return map.isEmpty();
    
    char ch1[]=s.toCharArray();
    char ch2[]=t.toCharArray();
    if(ch1.length!=ch2.length){
        return false;
    }
    Arrays.sort(ch1);
    Arrays.sort(ch2);
    return Arrays.equals(ch1,ch2);
       }
}