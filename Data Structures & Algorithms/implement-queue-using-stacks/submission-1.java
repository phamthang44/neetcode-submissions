class MyQueue {

    private Stack<Integer> inbox;   // dùng để push
    private Stack<Integer> outbox;  // dùng để pop/peek

    public MyQueue() {
        inbox = new Stack<>();
        outbox = new Stack<>();
    }
    
    public void push(int x) {
        inbox.push(x);
    }
    
    public int pop() {
        transfer();
        return outbox.pop();
    }
    
    public int peek() {
        transfer();
        return outbox.peek();
    }
    
    public boolean empty() {
        return inbox.isEmpty() && outbox.isEmpty();
    }

    private void transfer() {
        if (outbox.isEmpty()) {
            while (!inbox.isEmpty()) {
                outbox.push(inbox.pop());
            }
        }
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