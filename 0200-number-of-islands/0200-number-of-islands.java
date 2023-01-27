class Solution {
    public int numIslands(char[][] grid) {
      int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] != '0') {
                    count++;
                    shrink(grid, i, j);
                }
            }
        }
        return count;
    }
    
    void shrink(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0')
            return;
        grid[i][j] = '0';
        shrink(grid, i, j+1);
        shrink(grid, i, j-1);
        shrink(grid, i+1, j);
        shrink(grid, i-1, j);
 }
}