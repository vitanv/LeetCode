class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length, answer = 0;
        for(int i = 1; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == 1) matrix[i][j] = matrix[i - 1][j] + 1;
            }
        }
        for(int[] row : matrix){
            Arrays.sort(row);
            for(int i = m - 1, k = 1; i >= 0 && row[i] > 0; i--, k++){
                int p = row[i] * k;
                    answer = Math.max(answer, p);
            }
        }
        return answer;
    }
}