class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> seen = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        int[] triplet = {nums[i], nums[j], nums[k]};
                        Arrays.sort(triplet);
                        List<Integer> item = List.of(triplet[0], triplet[1], triplet[2]);
                        seen.add(item);
                    }
                }
            }
        }
        return new ArrayList<>(seen);
    }
}
