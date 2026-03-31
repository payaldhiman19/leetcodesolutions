class Solution {
    public String removeDuplicateLetters(String s) {
        int n=s.length();
        int lastindex[]=new int[26];
        boolean vis[]=new boolean[26];
        Stack<Character>st=new Stack<>();
        //store last occurence of character
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
         lastindex[ch-'a']=i;
        }
        //now check if alreadu visited just skip that
         for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(vis[ch-'a'])
            continue;
        //now check in stack if not empty check if top element in stack is bigger than curernt and that character agan comes in next index or last index check
        
        while(!st.isEmpty() &&st.peek()>ch&&lastindex[st.peek()-'a']>i){
            vis[st.pop()-'a']=false; //just remove last and make it unvisited so when it comes again we can push it
        }
        st.push(ch);
        vis[ch-'a']=true;
    }
    StringBuilder sb=new StringBuilder();
    for(char ch:st){
        sb.append(ch);
    }
    return sb.toString();
    }
}