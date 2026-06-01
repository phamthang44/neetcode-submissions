class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        Set<List<Integer>> seen = new HashSet<>();
        int n = nums.length;
        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                for (int k = j + 1; k < n - 1; k++) {
                    for (int d = k + 1; d < n; d++) {
                        long sum = (long) nums[i] + nums[j] + nums[k] + nums[d];
                        if (sum == (long) target) {
                            int[] quadruplets = new int[]{nums[i], nums[j], nums[k], nums[d]};
                            Arrays.sort(quadruplets);
                            List<Integer> item = List.of(quadruplets[0], quadruplets[1], quadruplets[2], quadruplets[3]);
                            seen.add(item);
                        } 
                    }
                }
            }
        }
        return new ArrayList<>(seen);
    }
}