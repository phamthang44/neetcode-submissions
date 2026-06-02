class Solution {
    public void rotate(int[] nums, int k) {
        int left = 0;
        int right = nums.length - 1;
        if (k > nums.length) {
            k = k % nums.length;
        }

        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }

        int left3 = 0;
        int right3 = k - 1;

        while (left3 < right3) {
            swap(nums, left3, right3);
            left3++;
            right3--;
        }
        
        int left2 = k;
        int right2 = nums.length - 1;

        while (left2 < right2) {
            swap(nums, left2, right2);
            left2++;
            right2--;
        }
    }

    private void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}