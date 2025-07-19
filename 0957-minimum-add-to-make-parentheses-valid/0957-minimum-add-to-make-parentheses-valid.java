class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character>st=new Stack<>();
       int insertions=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
             st.push(ch);   
            }else if(ch==')'){
                if(!st.isEmpty() &&st.peek()=='('){
                    //valid match 
                    st.pop();
            }else{
                //if not valid
                insertions++; //we need to insert ()
            }
            }
        }
        //stack size will give the open brackets and insertion ned to insert if any braxket is still in it also need need one valid string
        return insertions+st.size(); //st.size--how much in stack and 
    }
}