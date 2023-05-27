class Solution {
    public int minMeetingRooms(int[][] intervals) {
        int[] start = new int[intervals.length];
        int[] end = new int[intervals.length];
        for(int i = 0; i < intervals.length; i++){
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }
        
        Arrays.sort(end);
        Arrays.sort(start);
        int answer = 0, startIndex = 0, endIndex = 0;
        while(startIndex < intervals.length){
            if(start[startIndex] >= end[endIndex]){
                answer--;
                endIndex++;
            }
            answer++;
            startIndex++;
        }
        return answer;
    }
}