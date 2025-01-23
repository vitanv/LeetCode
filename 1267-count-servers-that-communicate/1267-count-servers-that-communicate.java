class Solution {
    public int countServers(int[][] grid) {
        if(grid.length == 0 || grid[0].length == 0) return 0;
        int answer = 0;
        int[] rows = new int[grid.length];
        int[] cols = new int[grid[0].length];
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[0].length; col++){
                if(grid[row][col] == 1){
                    rows[row]++;
                    cols[col]++;
                    answer++;
                }
            }
        }
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[0].length; col++){
                if(grid[row][col] == 1){
                    if(rows[row] == 1 && cols[col] == 1) answer--;
                }
            }
        }
        return answer;
    }
}