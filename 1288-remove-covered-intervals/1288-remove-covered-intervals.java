class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> b[0]-a[0]);
        
        int numRemove = 0;
        
        for (int i = 0; i < intervals.length; i++) {
            int lower = intervals[i][0];
            int higher = intervals[i][1];
            for (int j = i+1; j < intervals.length; j++) {
                if (lower >= intervals[j][0] && higher <= intervals[j][1]) {
                    numRemove += 1;
                    break;
                }
            }
        }
        
        return intervals.length - numRemove;
    }
}