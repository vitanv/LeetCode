class Solution {
    public int numWays(int steps, int arrLen) {
        int max = Math.min(steps, arrLen);
        int mod = 1000000007;
        int[][] dp = new int [max][steps + 1];
        dp[0][0] = 1;
        for(int i = 1; i <= steps; i++){
            for(int j = max - 1; j>= 0; j--){
                int total = dp[j][i - 1];
                if(j > 0) total = (total + dp[j - 1][i - 1]) % mod;
                if(j < max - 1) total = (total + dp[j +1][i - 1]) % mod;
                dp[j][i] = total;
            }
        }
        return dp[0][steps];
    }
}