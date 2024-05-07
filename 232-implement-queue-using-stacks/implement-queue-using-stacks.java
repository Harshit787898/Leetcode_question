class MyQueue {
   int q[],f,r;
    public MyQueue() {
        q=new int[101];
        f=0;
        r=0;
    }
    
    public void push(int x) {
        if(!isFull()){
           q[r]=x;
            r++;
        }
    }
    
    public int pop() {
        return q[f++];
    }
    
    public int peek() {
        return q[f];
    }
    
    public boolean empty() {
        if(f==r)
        return true;
        else
        return false;
    }

    public boolean isFull(){
        if(r==q.length)
        return true;
        else
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */