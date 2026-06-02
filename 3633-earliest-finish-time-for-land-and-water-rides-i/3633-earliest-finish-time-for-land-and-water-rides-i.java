class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int answer = Integer.MAX_VALUE, min = Integer.MAX_VALUE;
        for(int i = 0; i < landStartTime.length; i++){
            min = Math.min(min, landStartTime[i] + landDuration[i]);
        }
        for(int i = 0; i < waterStartTime.length; i++){
            answer = Math.min(answer, waterDuration[i] + Math.max(min, waterStartTime[i]));
        }
        min = Integer.MAX_VALUE;
        for(int i = 0; i < waterStartTime.length; i++){
            min = Math.min(min, waterStartTime[i] + waterDuration[i]);
        }
        for(int i = 0; i < landStartTime.length; i++){
            answer = Math.min(answer, landDuration[i] + Math.max(min, landStartTime[i]));
        }
        return answer;
    }
}