class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxDiagSq = 0, maxArea = 0;
        for(int[] dimension: dimensions){
            int diagSq = dimension[0] * dimension[0] + dimension[1] * dimension[1];
            int area = dimension[0] * dimension[1];
            if(diagSq > maxDiagSq){
                maxDiagSq = diagSq;
                maxArea = area;
            }else if(diagSq == maxDiagSq){
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }
}