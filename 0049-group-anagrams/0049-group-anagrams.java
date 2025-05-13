class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      Map<String,List<String>>map=new HashMap<>();
      //list string to stire the values for srted key string 
      //like --eat in sorted aet it becomes "aet":[eat,tea,ate] ,"ant":[tan,nat],"abt":[bat];
      for(String str:strs){
        char ch[]=str.toCharArray();
        Arrays.sort(ch);
        String sortedkey=new String(ch);
        if(!map.containsKey(sortedkey)){
            map.put(sortedkey,new ArrayList<>());
        }
        map.get(sortedkey).add(str);  //add otginal sring as key to sorted value
      }
      return new ArrayList<>(map.values());//return original values
    }
}