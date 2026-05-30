class Solution {
    public int[] replaceElements(int[] arr) {
        int rightMax = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int old = arr[i];
            //i = 6 thì rightMax và old = 2
            //i = 5 
            arr[i] = rightMax;
            rightMax = Math.max(rightMax, old);
        }
        return arr;
    }
}