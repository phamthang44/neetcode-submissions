class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();
        int n = arr1.length > arr2.length ? arr1.length : arr2.length;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (i < arr1.length) {
                result.append(arr1[i]);
            } 
            if (i < arr2.length) {
                result.append(arr2[i]);
            }
        }
        return new String(result);

    }
}