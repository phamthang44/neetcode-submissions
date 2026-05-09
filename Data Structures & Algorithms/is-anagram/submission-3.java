class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        List<String> arr = Arrays.asList(s.split(""));
        Collections.sort(arr);

        List<String> arr2 = Arrays.asList(t.split(""));
        Collections.sort(arr2);
        
        boolean isAnagram = arr.equals(arr2);
        return isAnagram;
    }
}
