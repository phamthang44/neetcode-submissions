class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        //
        for (int i = 0; i < nums.length; i++) {
            map.merge(nums[i], 1, Integer::sum);
        }

        Set<Integer> results = new HashSet<>();
        for (int num : nums) {
            if (map.get(num) > (nums.length / 3)) {
                results.add(num);
            }
        }
        return results.stream().toList();
    }
}