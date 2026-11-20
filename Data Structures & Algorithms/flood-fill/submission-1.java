public class Solution {
    int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int orig = image[sr][sc];
        if (orig == color) return image;

        dfs(image, sr, sc, orig, color);
        return image;
    }

    private void dfs(int[][] image, int r, int c, int orig, int color) {
        if (r < 0 || r >= image.length || c < 0 || c >= image[0].length || image[r][c] != orig) {
            return;
        }
        image[r][c] = color;
        for (int[] dir : directions) {
            dfs(image, r + dir[0], c + dir[1], orig, color);
        }
    }
}