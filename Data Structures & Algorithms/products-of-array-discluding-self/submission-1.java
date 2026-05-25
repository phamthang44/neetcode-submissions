class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int total = 1;
        for (int i = 0; i < nums.length; i++) {
            total = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    total = total * nums[j];
                }
            }
            output[i] = total;
        }
        return output;
    }
}