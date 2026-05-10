class Solution {
    public int removeElement(int[] nums, int val) {
        //xóa phần tử khỏi mảng in-place, ko tạo mảng mới
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            //[1,1,2,3,4] val = 1
            if (nums[i] != val) {
                nums[k] = nums[i]; //ghi current vào k ? 
                //i=2
                //k = 1
                //[2,1,2,3,4]
                //i=3
                //nums[k=1] = nums[i=3] 1 <- 3
                //[2,3,4,-,-]
                k++;
            } 
        }
        return k;
    }
}