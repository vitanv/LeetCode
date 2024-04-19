class Solution {
    public int numIslands(char[][] grid) {
        int answer = 0;
        for(int i = 0;i < grid.length;i++){
            for(int j = 0;j < grid[0].length;j++){
                if(grid[i][j] == '1'){
                    answer++;
                    sink(grid, i,j);
                }
            }
        }
        return answer;
    }
    public void sink(char[][] grid, int i, int j){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != '1') return;
        grid[i][j] = '0';
        sink(grid, i-1,j);
        sink(grid, i,j-1);
        sink(grid, i+1,j);
        sink(grid, i,j+1);
        
    }
        
}