class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean isDuplicate = false;
        Set<Integer> uniqueArray = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            uniqueArray.add(nums[i]); 
        }
        for (int i = 0 ; i < nums.length; i++) {
            if (uniqueArray.size() != nums.length) {
                isDuplicate = true;
            }
        }
        
        return isDuplicate;
    }
}