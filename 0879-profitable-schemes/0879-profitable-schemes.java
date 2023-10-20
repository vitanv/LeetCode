class Solution {
    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
        int answer = 0, mod = 1000000007;
        int[][] dp = new int[minProfit + 1][n + 1];
        dp[0][0] = 1;
        for(int i = 0; i < group.length; i++){
            int g = group[i];
            int p = profit[i];
            for(int j = minProfit; j >= 0; j--){
                for(int l = n - g; l >= 0; l--){
                    dp[Math.min(j + p, minProfit)][l + g] = (dp[Math.min(j + p, minProfit)][l + g] + dp[j][l]) % mod;
                }
            }
        }
        for(int d : dp[minProfit]){
            answer = (answer + d) % mod;
        }
        return answer;
    }
}