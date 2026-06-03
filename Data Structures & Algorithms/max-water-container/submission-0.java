class Solution {
    public int maxArea(int[] heights) {
        int area = 0;
        int minHeight = 0;
        int maxWater = 0;
        for (int i = 0; i < heights.length; i++) {
            for (int j = i + 1; j < heights.length; j++) {
                int width = j - i;
                minHeight = Math.min(heights[i], heights[j]);
                area = width * minHeight;

                maxWater = Math.max(maxWater, area);
            }
        }
        return maxWater;
    }
}
