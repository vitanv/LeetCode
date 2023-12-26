class Solution {
    int mod = 1000000007;
    public int numRollsToTarget(int n, int k, int target) {
        int[][]dp = new int[n + 1][target + 1];
        for(int[] array: dp){
            Arrays.fill(array, -1);
        }
        return count(n, k, target, dp);
        
    }
    public int count(int n, int k, int target, int[][] dp){
        if(n == 0 && target == 0) return 1;
        if(n == 0 || target < 0) return 0;
        if(dp[n][target ] != -1) return dp[n][target];
        int ways = 0;
        for(int i = 1; i <= k; i++){
            ways =(ways + count(n - 1, k, target - i, dp) % mod) % mod;
        }
        return dp[n][target] = ways;
    }
}