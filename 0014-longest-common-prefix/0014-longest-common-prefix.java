class Solution {
    public String longestCommonPrefix(String[] strs) {
      int n=strs.length;
      String ans="";
      String st=strs[0];
      for(int i=0;i<st.length();i++){
        char ch=st.charAt(i);
        for(int j=1;j<n;j++){
            if(i>=strs[j].length() || strs[j].charAt(i)!=ch){
                return ans;
            }
        }
        ans+=ch;
      }
      return ans;
    }
}