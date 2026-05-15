class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>st=new HashSet<>();
        int maxlength=0;
        int start=0;
        for(int end=0;end<s.length();end++){
            while(st.contains(s.charAt(end))){
                st.remove(s.charAt(start));
                start++;
            }
            st.add(s.charAt(end));
            maxlength=Math.max(maxlength,end-start+1);
        }
        return maxlength;
    }
}