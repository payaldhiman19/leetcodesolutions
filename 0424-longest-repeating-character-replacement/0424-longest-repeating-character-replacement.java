class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int maxfreq=0;
        int left=0; int maxlen=0;
        HashMap<Character,Integer>map=new HashMap<>();
        for(int right=0;right<n;right++){
            char ri=s.charAt(right);
            map.put(ri,map.getOrDefault(ri,0)+1);
            maxfreq=Math.max(maxfreq,map.get(ri));
            //replacement needed=window size-maxfreq element <k valid move else shrink
            if((right-left+1)-maxfreq>k){
                char lefti=s.charAt(left);
                map.put(lefti,map.get(lefti)-1);
                if(map.get(lefti)==0)
                map.remove(lefti);
                left++;
            }
           maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}