class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n=asteroids.length;
        Stack<Integer>st=new Stack<>();
        for(int a:asteroids){
            boolean destroy=false;
            while(!st.isEmpty() &&a<0 &&st.peek()>0){
                //check if negative is smaller or grater 
                if(st.peek()<-a){
                st.pop();
                continue;
                //keep checking
                }else if(st.peek()==-a){
                    st.pop();
                }
                destroy=true;
                break;
            }
            if(!destroy){
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