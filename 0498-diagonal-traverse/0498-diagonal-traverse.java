class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat[0].length, m = mat.length, col = 0, row = 0;
        int[] answer = new int[n * m];
        boolean goingUp = true;
        for(int i = 0; i < n * m; i++){
            answer[i] = mat[row][col];
            if(goingUp){
                if(col == n - 1){
                    goingUp = false;
                    row++;
                }else if(row == 0){
                    goingUp = false;
                    col++;
                }else{
                    row--;
                    col++;
                }
            }else{
                if(row == m - 1){
                    goingUp = true;
                    col++;
                }else if(col == 0){
                    goingUp = true;
                    row++;
                }else{
                    row++;
                    col--;
                }
            }
        } 
        return answer;
    }
}