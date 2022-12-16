class MyQueue {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        stack1.push(x);
    }
    
    public int pop() {
        int temp = peek();
        stack2.pop();
        return temp;
    }
    
    public int peek() {
        if(stack2.empty()){
            while(!stack1.empty()){
                stack2.push(stack1.pop());
            } 
        }
        return stack2.peek();
    }
    
    public boolean empty() {
        return stack1.empty() && stack2.empty();
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