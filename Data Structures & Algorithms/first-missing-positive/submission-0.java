class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int missingPositiveNum = 0;
        for (int i = 1; i < nums.length + 1; i++) {
            if (!set.contains(i)) {
                missingPositiveNum = i;
                return missingPositiveNum;
            }
        }
        return nums.length + 1;
    }
}