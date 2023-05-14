class Solution {
    public int maxScore(int[] nums) {
        return dfs(nums, new int[nums.length/2 + 1][1 << nums.length],1 ,0);
    }
    public int dfs(int[] nums, int[][] dp, int i, int mask){
        if(i > nums.length / 2) return 0;
        if(dp[i][mask] == 0){
            for(int j = 0; j < nums.length;j++){
                for(int k = j + 1; k < nums.length; k++){
                    int newMask = (1 << j) + (1 << k);
                    if((mask & newMask) == 0){
                        dp[i][mask] = Math.max(dp[i][mask], i * gcd(nums[j], nums[k]) + dfs(nums, dp, i+1, mask + newMask));
                    }
                }
            }
        }
        return dp[i][mask];
    }
    public int gcd(int j, int k){
        if(k == 0) return j;
        return gcd(k, j % k);
    }
}