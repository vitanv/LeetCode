class Solution {
    public int maxValueOfCoins(List<List<Integer>> piles, int k) {
        Integer[][] dp = new Integer[piles.size() + 1][k + 1];
        return max(piles, dp, 0, k);
    }
    public int max(List<List<Integer>> piles, Integer[][] dp, int i, int k){
        if(i == piles.size() || k == 0) return 0;
        if(dp[i][k] != null) return dp[i][k];
        int answer = max(piles, dp, i + 1, k);
        int curr = 0;
        for(int j = 0; j < Math.min(piles.get(i).size(), k); j++){
            curr += piles.get(i).get(j);
            answer = Math.max(answer, curr + max(piles, dp, i + 1, k - j - 1));
        }
        dp[i][k] = answer;
        return dp[i][k];
    }
}