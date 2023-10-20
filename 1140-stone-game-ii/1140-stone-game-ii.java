class Solution {
    public int stoneGameII(int[] piles) {
        int[] dp = Arrays.copyOf(piles, piles.length);
        for (int i = dp.length - 2; i >= 0 ; i--) {
            dp[i] += dp[i + 1];
        }
        return dfs(dp, 1, 0, new int[piles.length][piles.length]);
    }
    public int dfs(int[] dp, int m, int p, int[][] memo){
        if(p + 2* m >= dp.length) return dp[p];
        if(memo[p][m] > 0) return memo[p][m];
        int answer = 0, temp =0;
        for(int i = 1; i <= 2*m; i++){
            temp = dp[p] - dp[p + i];
            answer = Math.max(answer, temp + dp[p + i] - dfs(dp, Math.max(i,m), p+i, memo));
            
        }
        memo[p][m] = answer;
        return answer;
    }
}