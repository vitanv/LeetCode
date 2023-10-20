public class Solution {
    public int[][] multiply(int[][] mat1, int[][] mat2) {
        int m = mat1.length, n = mat1[0].length, o = mat2[0].length;
        int[][] mat3 = new int[m][o];

        for(int i = 0; i < m; i++) {
            for(int k = 0; k < n; k++) {
                if (mat1[i][k] != 0) {
                    for (int j = 0; j < o; j++) {
                        if (mat2[k][j] != 0) mat3[i][j] += mat1[i][k] * mat2[k][j];
                    }
                }
            }
        }
        return mat3;   
    }
}