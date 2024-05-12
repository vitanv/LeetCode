class Solution {
    public int[][] largestLocal(int[][] grid) {
        int[][] answer = new int[grid.length - 2][grid[0].length - 2];
        int lastRow = 2,lastCol = 2, row = 0, col = 0;
        while(lastRow < grid.length){
            while(lastCol < grid[0].length){
                answer[row][col] = max(grid, lastRow, lastCol);
                lastCol++;
                col++;
            }
            lastRow++;
            row++;
            lastCol = 2;
            col = 0;
        }
        return answer;
    }
    public int max(int[][] grid, int lastRow, int lastCol){
        int max = 0;
        for(int i = lastRow - 2; i <= lastRow; i++){
            for(int j = lastCol - 2; j <= lastCol; j++){
                max = Math.max(max, grid[i][j]);
            }
        }
        return max;
    }
}