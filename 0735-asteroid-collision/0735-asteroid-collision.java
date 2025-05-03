class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n=asteroids.length;
        Stack<Integer>st=new Stack<>();
        for(int a:asteroids){
            boolean destroyed=false;
            //collisoon w
    while(!st.isEmpty() &&a<0&&st.peek()>0){
        //if negative number occurs then pop it
        if(st.peek()<-a){
            st.pop();
            //keep chcking
            continue;
        }else if(st.peek()==-a){
            //if both are same then destroy both
            st.pop();
        }
        destroyed=true;
        break;
    }
    if(!destroyed){
        st.push(a);
    }
        }
int res[]=new int[st.size()];
 for(int i=res.length-1;i>=0;i--){
    res[i]=st.pop();
 }
 return res;
    }
}