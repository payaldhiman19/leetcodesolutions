class Solution {
    public int apply(String s,int a,int b){
        switch(s){
           case"+":return a+b;
           case"-":return a-b;
           case"/":return a/b;
           case"*":return a*b;
        }
     return 0;
    }
    public boolean operator(String s){
        return s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/");
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer>st=new Stack<>();
        for(String token:tokens){
            if(operator(token)){
                int b=st.pop();
                int a=st.pop();
                int res=apply(token,a,b);
                st.push(res);
            }else{
                st.push(Integer.parseInt(token));
            }
        }
        return st.pop();
    }
}