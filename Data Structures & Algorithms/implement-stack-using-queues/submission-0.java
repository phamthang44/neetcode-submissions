class MyStack {

    private int[] data;
    private int size;

    public MyStack() {
        data = new int[10];
        size = 0;
    }

    public void push(int x) {
        data[size++] = x;
    }

    public int pop() {
        return data[--size];
    }

    public int top() {
        return data[size - 1];
    }

    public boolean empty() {
        return size == 0;
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