class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int maxfreq=0; int maxx=0;int left=0;
        HashMap<Character,Integer>map=new HashMap<>();
        for(int right=0;right<n;right++){
            char ch=s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxfreq=Math.max(maxfreq,map.get(ch));
            if((right-left+1)-maxfreq>k){
                char lefti=s.charAt(left);
                map.put(lefti,map.get(lefti)-1);
                left++;
            }
            maxx=Math.max(maxx,right-left+1);
        }
        return maxx;
    }
}