class Solution {
    public boolean palindrome(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        String longest="";
        int n=s.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(palindrome(s,i,j)&&longest.length()<j-i+1){
                    longest=s.substring(i,j+1);
                }
            }
        }
        return longest;
    }
}