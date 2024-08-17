class Solution {
    public long maxPoints(int[][] points) {
        int rows = points.length, cols = points[0].length;
        long answer = 0;
        long[] prev = new long[cols];
        for(int i = 0; i < cols; i++){
            prev[i] = points[0][i];
        }
        for(int i = 0; i < rows - 1; i++){
            long[] left = new long[cols];
            long[] right = new long[cols];
            long[] curr = new long[cols];
            left[0] = prev[0];
            for(int j = 1; j < cols; j++){
                left[j] = Math.max(left[j - 1] - 1, prev[j]);
            }
            right[cols - 1] = prev[cols - 1];
            for(int j = cols - 2; j >= 0; j--){
                right[j] = Math.max(right[j + 1] - 1, prev[j]); 
            }
            for(int j = 0; j < cols; j++){
                curr[j] = points[i + 1][j] + Math.max(left[j], right[j]);
            }
            prev = curr;
        }
        for(int i = 0; i < cols; i++){
            answer = Math.max(answer, prev[i]);
        }
        return answer;
    }
}