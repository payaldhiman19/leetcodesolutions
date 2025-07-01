class Solution {
    public int possibleStringCount(String word) {
        int cnt=1;
        //it should be 1+total number of characters that can be removed
        //to remove the how many character we need theri cnt so 1+count of number repeating here
        // 1-->original string or character
        for(int i=1;i<word.length();i++){
            if(word.charAt(i-1)==word.charAt(i)){
                cnt++;
            }
        }
        return cnt;
    }
}