class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[] onesRow = new int[m];
        int[] onesCol = new int[n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1){
                    onesRow[i]++;
                    onesCol[j]++;
                }else{
                    onesRow[i]--;
                    onesCol[j]--;
                }
            }
        }
        int[][]answer = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                answer[i][j] = onesRow[i] + onesCol[j];
            }
        }
        return answer;
    }
}