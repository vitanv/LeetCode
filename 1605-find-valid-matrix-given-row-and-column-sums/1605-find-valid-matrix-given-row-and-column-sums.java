class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int m = rowSum.length, n = colSum.length;
        int[] currRow = new int[m];
        int[]currCol = new int[n];
        int[][] answer = new int[m][n];
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                answer[i][j] = Math.min(rowSum[i] - currRow[i], colSum[j] - currCol[j]);
                currRow[i] += answer[i][j];
                currCol[j] += answer[i][j];
            }
        }
        return answer;
    }
}