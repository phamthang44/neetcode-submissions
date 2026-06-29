class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int temp = Math.abs(s.charAt(i) - s.charAt(i+1));
            //99 - 111 = 12 score += 12
            //i = 2; i < 4

            score += temp;
        }
        return score;
    }
}