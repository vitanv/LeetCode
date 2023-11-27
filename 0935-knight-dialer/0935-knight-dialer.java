class Solution {
    public int knightDialer(int n) {
        int answer = 0, mod = 1000000007;
        int[][] jumps = {{4, 6}, {6, 8}, {7, 9}, {4, 8}, {0, 3, 9}, {}, {0, 1, 7}, {2, 6}, {1, 3}, {2, 4}};
        int[][] dp = new int[n][10];
        Arrays.fill(dp[0],1);
        for(int i = 1; i < n; i++){
            for(int j = 0; j < 10; j++){
                for(int jump : jumps[j]){
                    dp[i][j] = (dp[i][j] + dp[i - 1][jump]) % mod;
                }
            }
        }
        for(int i : dp[n - 1]){
            answer = (answer + i) % mod;
        }
        return answer;
    }
}