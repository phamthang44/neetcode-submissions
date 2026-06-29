class Solution {
    public boolean isPerfectSquare(int num) {
        int root = mySqrt(num);
        return (long) root * root == num;
    }

    public boolean isInteger(Integer num) {
        return num % 1 == 0;
    }

    public int mySqrt(int x) {
        if (x == 0) return 0;
        if (x == 1) return 1;
        int result = 1;
        for (int i = 1; i < x; i++) {
            if ((long) i * i > x) {
                return result;
            } 
            result = i;
        }
        return result;
    }
    
}