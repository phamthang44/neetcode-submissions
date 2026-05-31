class Solution {
    public void moveZeroes(int[] nums) {
        //[0,0,1,2,0,5]
        //i=0
        //0 swap với 5
        //[5,0,1,2,0,0]
        //i=1
        //0 swap zới 2 ???
        int writePos = 0; 
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) continue;
            nums[writePos] = nums[i];
            writePos++;
        }

        while (writePos < nums.length) {
            nums[writePos] = 0;
            writePos++;
        }
        
    }
}