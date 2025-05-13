class Solution {
    public int characterReplacement(String s, int k) {
        int freq[]=new int[256];
        int res=0;
        int left=0;
        int maxcnt=0;
        for(int right=0;right<s.length();right++){
            freq[s.charAt(right)-'A']++;
            //add in frequency array of each character
            maxcnt=Math.max(maxcnt, freq[s.charAt(right)-'A']);
            //window-maxcnt--give the number of character to replace but of it is fretare than k shrink it and also decrease the freq of character
          if((right-left+1)-maxcnt>k){
            freq[s.charAt(left)-'A']--;
            left++;
          }
            res=Math.max(res,right-left+1);
        }
        return res;
    }
}