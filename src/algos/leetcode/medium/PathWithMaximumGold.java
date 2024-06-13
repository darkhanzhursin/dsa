package algos.leetcode.medium;

public class PathWithMaximumGold {

    public static void main(String[] args) {
        int res = getMaximumGold(new int[][]{{0,6,0},{5,8,7},{0,9,0}});
        System.out.println(res);
    }
    static int max = 0;
    public static int getMaximumGold(int[][] grid) {
        for(int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] != 0) {
                    trackPath(i,j, grid, 0);
                }
            }
        }
        return max;
    }

    private static void trackPath(int i, int j, int[][] grid, int sum) {
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0) {
            max = Math.max(max, sum);
            return;
        }
        int val = grid[i][j];
        sum += val;
        grid[i][j] = 0;
        trackPath(i + 1, j, grid, sum);
        trackPath(i - 1, j, grid, sum);
        trackPath(i, j + 1, grid, sum);
        trackPath(i, j - 1, grid, sum);
        grid[i][j] = val;

    }
}
