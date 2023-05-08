class Solution {
    public int diagonalSum(int[][] mat) {
        int answer = 0;
        for(int i = 0; i < mat.length; i++){
            answer+=mat[i][i]+mat[i][mat.length - 1 - i];
            if(i == mat.length/2 && mat.length % 2 != 0) answer-= mat[i][i];
        }
        return answer;
    }
}