class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int answer = Integer.MAX_VALUE;
        for(int i = 1; i < n; i++){
            for(int j = 0; j < n; j++){
                if(j == 0) {
                    matrix[i][j] = Math.min(matrix[i-1][j], matrix[i-1][j+1]) + matrix[i][j];
                }else if(j == n-1){
                    matrix[i][j] = Math.min(matrix[i-1][j], matrix[i-1][j-1]) + matrix[i][j];
                }else{
                     matrix[i][j] = Math.min(matrix[i-1][j],Math.min(matrix[i-1][j-1],matrix[i-1][j+1])) + matrix[i][j];
                }
            }
        }
        for(int i = 0; i < n; i++){
            answer = Math.min(answer, matrix[n-1][i]);
        }
        return answer;
    }
}