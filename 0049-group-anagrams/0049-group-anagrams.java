class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       
        //use sorted string as key and originl as its value and whenever you find the same sorted key just point that orginal string to that key also
        Map<String,List<String>>map=new HashMap<>();
        for(String s:strs){
            char ch[]=s.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}