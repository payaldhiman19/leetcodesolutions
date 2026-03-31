class MyStack {
    Queue<Integer>q;
    public MyStack() {
        q=new LinkedList<>();
    }
    
    public void push(int x) {
         int size=q.size();
           //we add it will added at last --FIFO
        q.add(x);
        //we make FIFO --LIFO BY my removing firsta nd adding at last so then it becomes last in first out last will become stack top
        for(int i=0;i<size;i++){
            q.add(q.remove());
        }
    }
    
    public int pop() {
        if(q.isEmpty()){
            return -1;
        }
        return q.remove();
    }
    
    public int top() {
        if(q.isEmpty()){
            return -1;
        }
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */