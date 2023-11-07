class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int n = dist.length, timePassed = 0, answer = 0;
        int[] time = new int[n];
        for(int i = 0; i < n; i++){
            double d = dist[i];
            double s = speed[i];
            double t = d/s;
            time[i] = (int) Math.ceil(t);
        }
        Arrays.sort(time);
        for(int t : time){
            if(t - timePassed > 0){
                answer++;
                timePassed++;
            }else{
                return answer;
            }
        }
        return answer;
    }
}