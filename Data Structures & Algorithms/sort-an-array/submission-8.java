class Solution {
    public int[] sortArray(int[] nums) {
        int max = Arrays.stream(nums).max().getAsInt();
        int min = Arrays.stream(nums).min().getAsInt();
        int[] count = new int[max - min + 1];

        for (int i = 0; i < nums.length; i++) {
            count[nums[i] - min]++;
        }
        int idx = 0;
        for (int i = 0; i <= (max - min); i++) {
            while (count[i]-- > 0) {
                nums[idx++] = i + min;
            }
        }
        return nums;
    }
}