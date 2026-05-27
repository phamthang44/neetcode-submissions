class Solution {
    public int removeDuplicates(int[] nums) {
        // Set<Integer> hset = new HashSet<>();
        
        // for (int num : nums) {
        //     hset.add(num);
        // }

        // int[] removeDuplicates = hset.stream().mapToInt(Number::intValue).toArray();

        // return removeDuplicates.length;
        if (nums.length == 0) return 0;
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[k]) {
                k++;
                nums[k] = nums[i];
            }
        }

        return k+1;
    }
}