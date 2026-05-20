class Solution {
    public int longestConsecutive(int[] nums) {
        int longestStreak = 0;
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        for (int num : numSet) {
            boolean isSequenceStart = !numSet.contains(num - 1);

            if (isSequenceStart) {
                int currentNum = num;
                int currentStreak = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;
    }
}
