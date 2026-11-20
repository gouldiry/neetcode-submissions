
class Solution {
    private int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};

    public void solve(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;

        // Find safe O's connected to the border
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (r == 0 || c == 0 || r == rows - 1 || c == cols - 1) {
                    if (board[r][c] == 'O') {
                        dfs(board, r, c);
                    }
                }
            }
        }

        // Flip surrounded O's and restore safe O's
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (board[r][c] == 'O') {
                    board[r][c] = 'X';
                } else if (board[r][c] == '#') {
                    board[r][c] = 'O';
                }
            }
        }
    }

    private void dfs(char[][] board, int r, int c) {
        if (r < 0 || c < 0 || r >= board.length || c >= board[0].length || board[r][c] != 'O') {
            return;
        }

        board[r][c] = '#';

        for (int[] dir : directions) {
            dfs(board, r + dir[0], c + dir[1]);
        }
    }
}
