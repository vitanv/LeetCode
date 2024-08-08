class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] answer = new int[rows * cols][2];
        int n = 0, x = 0, y = 1, temp;
        for(int i = 0; i < rows * cols; n++){
            for(int j = 0; j < n / 2 + 1; j++){
                if(rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols){
                    answer[i] = new int[]{rStart, cStart};
                    i++;
                }
                rStart += x;
                cStart += y;
            }
            temp = x;
            x = y;
            y = - temp;
        }
        return answer;
    }
}