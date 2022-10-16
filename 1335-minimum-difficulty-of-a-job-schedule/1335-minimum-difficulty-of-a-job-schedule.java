class Solution {
    public int minDifficulty(int[] jobDifficulty, int d) {
        int len = jobDifficulty.length;
        if(d > len) return  -1;
        int[][] dp = new int[d-1][len];
        for(int[]day : dp) Arrays.fill(day, -1);
        return dfs(jobDifficulty, d-1, 0, dp);
    }
    
    private int dfs(int[] job, int d, int position, int[][] dp ){
        if(d == 0){
            int max = job[position];
            for(int i = position; i < job.length;i++){
                max = Math.max(max, job[i]);
            }
            return max;
        }
        int day = dp.length - d;
        if(dp[day][position] != -1) return dp[day][position];
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = position; i < job.length-d;i++){
            max = Math.max(max, job[i]);
            min = Math.min(min, max + dfs(job, d-1,i+1,dp));
        }
        return dp[day][position] = min;
    }
}