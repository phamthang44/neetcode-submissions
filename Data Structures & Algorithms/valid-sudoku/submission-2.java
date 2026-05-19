class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            Set<Character> row = new HashSet<>();
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != '.') {
                    if (!row.add(board[i][j])) return false;
                } 
            }
        }
        for (int j = 0; j < 9; j++) {
            Set<Character> column = new HashSet<>();
            for (int i = 0; i < board[j].length; i++) {
                if (board[i][j] != '.') {
                    if (!column.add(board[i][j])) return false;
                }
            }
        }
        // outer 2 loops → find which box
              
        for (int boxRow = 0; boxRow < 3; boxRow++) {
            for (int boxCol = 0; boxCol < 3; boxCol++) {
                // inner 2 loops → visit cells inside that box
                //row outer loop -> 1
                //inner loop -> 3
                Set<Character> boxes = new HashSet<>();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (board[boxRow * 3 + i][boxCol * 3 + j] != '.') {
                            if (!boxes.add(board[boxRow * 3 + i][boxCol * 3 + j])) return false;
                        } 
                    }
                }
            }
        }
        return true;
    }
}
