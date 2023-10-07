class Solution {
    public int numOfArrays(int n, int m, int k) {
        long[][][] dp = new long[n][k][m];
        int mod = 1000000007;
        Arrays.fill(dp[0][0], 1);
        for(int i = 1; i < n; i++){
            for(int j = 0; j < Math.min(i + 1, k); j++){
                for(int max = 0; max < m; max++){
                    dp[i][j][max] = (dp[i][j][max] + (max + 1) * dp[i - 1][j][max]) % mod;
                    if(j != 0){
                        long sum = 0;
                        for(int oldMax = 0; oldMax < max; oldMax++){
                            sum += dp[i - 1][j - 1][oldMax];
                            sum %= mod;
                        }
                        dp[i][j][max] = (dp[i][j][max] +sum) % mod;
                    }
                }
            }
        }
        long answer = 0;
        for(int max = 0; max < m; max++){
            answer += dp[n - 1][k - 1][max];
            answer %= mod;
        }
        return (int)answer;
    }
}