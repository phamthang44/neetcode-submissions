class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int prefixLeft = 1;
        int prefixRight = 1;
        for (int i = 0; i < nums.length; i++) {
            output[i] = prefixLeft;
            prefixLeft = prefixLeft * nums[i];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            output[i] = output[i] * prefixRight;
            prefixRight = prefixRight * nums[i]; 
        }
        return output;
    }
}  
