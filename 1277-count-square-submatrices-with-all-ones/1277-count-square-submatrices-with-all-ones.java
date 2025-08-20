class Solution {
    public int countSquares(int[][] matrix) {
        int answer = 0, row = matrix.length, col = matrix[0].length;
        int[][] dp = new int[row + 1][col + 1];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(matrix[i][j] == 1){
                    dp[i + 1][j + 1] = Math.min(dp[i][j], Math.min(dp[i][j+1], dp[i + 1][j])) + 1;
                    answer += dp[i + 1][j + 1];
                }
            }
        }
        return answer;
    }
}