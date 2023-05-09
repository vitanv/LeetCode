class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length-1, n = matrix[0].length-1, len = m*n, row = 0, col = 0;
        List<Integer> answer = new ArrayList<Integer>();

        while(true){
            for(int j = col; j <= n;j++){
                answer.add(matrix[row][j]);
            }
            row++;
            if(col > n || row > m) break;
            for(int j = row; j <= m;j++){
                answer.add(matrix[j][n]);
            }
            n--;
            if(col > n || row > m) break;
            for(int j = n; j >=col;j--){
                answer.add(matrix[m][j]);
            }
            m--;
            if(col > n || row > m) break;
            for(int j = m; j >=row;j--){
                answer.add(matrix[j][col]);
            }
            col++;
            if(col > n || row > m) break;
            
        }
        return answer;
    }
}