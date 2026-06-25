class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            } 
            j++;
            //1 pattern đều j++ thì rút gọn thành như trên
        }
        if (i == s.length()) return true;
        return false;
    }
}