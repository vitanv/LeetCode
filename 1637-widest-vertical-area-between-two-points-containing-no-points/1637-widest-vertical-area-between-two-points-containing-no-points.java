class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, (a,b) -> a[0] - b[0]);
        int answer = Integer.MIN_VALUE;
        for(int i = 1; i < points.length; i++){
            answer = Math.max(answer,points[i][0] - points[i- 1][0]);
        }
        return answer;
    }
}