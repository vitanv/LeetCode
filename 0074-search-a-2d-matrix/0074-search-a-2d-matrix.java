class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0;i<matrix.length;i++){
            if(target>=matrix[i][0] && target<= matrix[i][matrix[i].length-1]){
                for(int j = 0;j<matrix[i].length;j++){
                    if(matrix[i][j] == target) return true;
                }
            }
        }
        return false;
    }
}