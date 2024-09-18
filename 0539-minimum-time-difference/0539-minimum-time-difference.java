class Solution {
    public int findMinDifference(List<String> timePoints) {
        int[] time = new int[timePoints.size()];
        for(int i = 0; i < time.length; i++){
            String[] minutes = timePoints.get(i).split(":");
            time[i] = Integer.parseInt(minutes[0]) * 60 + Integer.parseInt(minutes[1]);
        }
        Arrays.sort(time);
        int answer = 1440 - time[time.length - 1] + time[0];
        for(int i = 1; i < time.length; i++){
            answer = Math.min(answer,time[i] - time[i - 1]);
        }
        return answer;
    }
}