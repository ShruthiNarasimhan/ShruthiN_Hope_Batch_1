class Solution {
    public int islandPerimeter(int[][] grid) {
        int m = grid.length, n = grid[0].length, peri = 0;

        for(int r = 0; r < m; r++){
            for(int c = 0; c < n; c++){
                if(grid[r][c] == 1){
                    peri += 4;
                    if(r > 0 && grid[r - 1][c] == 1) peri -= 2;
                    if(c > 0 && grid[r][c - 1] == 1) peri -= 2;
                }
            }
        }
        return peri;
    }
}