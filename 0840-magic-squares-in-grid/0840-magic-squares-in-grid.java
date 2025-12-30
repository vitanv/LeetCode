class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int answer = 0;
        for(int i = 0; i < grid.length - 2; i++){
            for(int j = 0; j < grid[0].length - 2; j++){
                if(check(grid, i, j)) answer++;
            }
        }
        return answer;
    }
    public boolean check(int[][] grid, int row, int col){
        String str = "2943816729438167", rev = "7618349276183492";
        StringBuilder sb = new StringBuilder();
        int[] border = new int[]{0,1,2,5,8,7,6,3};
        for(int i: border){
            sb.append(grid[row + i / 3][col + (i % 3)]);
        }
        String converted = sb.toString();
        return(grid[row][col] % 2 == 0 && 
               (str.contains(converted) || 
                rev.contains(converted)) && grid[row + 1][col + 1] == 5 );
    }
}