class DynamicArray {

    private int[] data;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public DynamicArray(int capacity) {
        data = new int[capacity != 0 ? capacity : DEFAULT_CAPACITY];
        size = 0;
    }

    public int get(int i) {
        return data[i];
    }

    public void set(int i, int n) {
        data[i] = n;
    }

    public void pushback(int n) {
        if (size >= data.length) {
            resize();
        }

        data[size] = n;
        size++;
    }

    public int popback() {
        int temp = data[size - 1];
        data[size - 1] = 0;
        size--;
        return temp;
    }

    private void resize() {
        data = Arrays.copyOf(data, data.length * 2);
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return data.length;
    }
}
