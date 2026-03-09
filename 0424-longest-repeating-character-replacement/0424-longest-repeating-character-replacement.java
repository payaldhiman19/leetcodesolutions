class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        HashMap<Character,Integer>map=new HashMap<>();
        int maxfreq=0;
        int maxlen=0;
        int left=0;
        for(int right=0;right<n;right++){
            char ch=s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxfreq=Math.max(maxfreq,map.get(ch));
            if((right-left+1)-maxfreq>k){
                //shrink the window
                char next=s.charAt(left);
                map.put(next,map.get(next)-1);
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}