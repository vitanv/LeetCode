class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points.length == 0) return 0;
        Arrays.sort(points, (x, y) -> Integer.compare(x[1],y[1]));
        int answer = 0, minEnd = 0;
        for(int[] point : points){
            if(answer == 0 || point[0] > minEnd){
                answer++;
                minEnd = point[1];
            }
        }
        return answer;
    }
}