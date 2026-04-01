class Solution {
    public int solve(String s,int start,int end,int k){
        //base case
        if(end-start<k)return 0;
        int freq[]=new int[26];
        for(int i=start;i<end;i++){
            freq[s.charAt(i)-'a']++; //count freq
        }
        //check invalid charcater which is less tah n k just split them to left and right part like "aaa" |"bb"here b is 2 a is 3 so a is max
                for(int i=start;i<end;i++){
                if(freq[s.charAt(i)-'a']<k){
                    //split them 
                    int left=solve(s,start,i,k);
                    int right=solve(s,i+1,end,k);
                    return Math.max(left,right);
                }
        }
  //if no invaid then whole string is valid
       return end-start;
    }
    public int longestSubstring(String s, int k) {
        //hashmap +sliding window
       return solve(s,0,s.length(),k);
    }
}