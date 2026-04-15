class Solution {
    public String minWindow(String s, String t) {
       if(s.length()==0||t.length()==0){
        return "0";
       } 
       HashMap<Character,Integer>map=new HashMap<>();
       for(char ch:t.toCharArray()){
        map.put(ch,map.getOrDefault(ch,0)+1);
       }
       int required=map.size();
       int formed=0;int start=0;int left=0;int right=0;
       int minlen=Integer.MAX_VALUE;
        HashMap<Character,Integer>window=new HashMap<>();
       while(right<s.length()){
        char c=s.charAt(right);
        window.put(c,window.getOrDefault(c,0)+1);
        if(map.containsKey(c)&&window.get(c).intValue()==map.get(c).intValue()){
            formed++;
        }
        while(left<=right&&formed==required){
            c=s.charAt(left);
            if(right-left+1<minlen){
                minlen=right-left+1;
                start=left;
            }
             window.put(c,window.get(c)-1);
             if(map.containsKey(c)&&window.get(c)<map.get(c)){
                formed--;
             }
             left++;
        }
        right++;
       }
       return  minlen==Integer.MAX_VALUE?"":s.substring(start,start+minlen);
    }
}