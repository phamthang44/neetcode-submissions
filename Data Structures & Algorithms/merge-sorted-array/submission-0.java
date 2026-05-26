class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;       // last real element in nums1
        int p2 = n - 1;       // last element in nums2
        int k  = m + n - 1;   // last index of nums1 (write position)
        
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[k] = nums1[p1];
                p1--;
            } else {
                nums1[k] = nums2[p2];
                p2--;
            }
            k--;
        }

        // If nums2 still has leftovers, copy them
        // (if nums1 still has leftovers, they're already in place)
        while (p2 >= 0) {
            nums1[k] = nums2[p2];
            p2--;
            k--;
        }
    }
}