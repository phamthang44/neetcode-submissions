class NumMatrix {

    private int[][] numMatrix;

    public NumMatrix(int[][] matrix) {
        this.numMatrix = matrix;
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int prefixSum = 0;
        //i = matrix[2][1] = 2; i < matrix[2][3] = 1
        for (int j = row1; j <= row2; j++) {
            for (int i = col1; i <= col2; i++) {
                prefixSum += numMatrix[j][i];
            } 
        }
        return prefixSum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */