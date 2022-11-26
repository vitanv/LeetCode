class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        Job[] jobs = new Job[profit.length];
        for (int i = 0; i < startTime.length; i++) {
            jobs[i] = (new Job(startTime[i], endTime[i], profit[i]));
        }
        
        int dp[] = new int[jobs.length];
        Arrays.sort(jobs, (a,b)->(a.end - b.end));
        
        dp[0] = jobs[0].profit;
        for (int i = 1; i < jobs.length; i++){
            dp[i] = Math.max(jobs[i].profit, dp[i-1]);
            for(int j = i-1; j >= 0; j--){
                if(jobs[j].end <= jobs[i].start){
                    dp[i] = Math.max(dp[i], jobs[i].profit + dp[j]);
                    break;
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int val : dp) {
            max = Math.max(val, max);
        }
        return max;
    }
    
    
}

class Job{
    int start, end, profit;
    
    public Job(int startTime, int endTime,int profitGained){
        this.start = startTime;
        this.end = endTime;
        this.profit = profitGained;
    }
}

