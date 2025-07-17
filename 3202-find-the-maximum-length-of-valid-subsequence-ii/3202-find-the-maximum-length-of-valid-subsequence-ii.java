class Solution {

    public int maximumLength(int[] nums, int k) {
        int answer = 0;
        int[][] dp = new int[k][k];
        for (int num : nums) {
            num %= k;
            for (int i = 0; i < k; i++) {
                dp[i][num] = dp[num][i] + 1;
                answer = Math.max(answer, dp[i][num]);
            }
        }
        return answer;
    }
}