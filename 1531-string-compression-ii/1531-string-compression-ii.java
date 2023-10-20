class Solution {
    public int getLengthOfOptimalCompression(String s, int k) {
        int[][] dp = new int[110][110];
        int len = s.length();
        for(int i = 0; i <= len; i++){
            for(int j = 0; j <= len; j++){
                dp[i][j] = 99999;
            }
        }
        dp[0][0] = 0;
        for(int i = 1; i <= len; i++){
            for(int j = 0; j <= k; j++){
                int concat = 0, delete = 0;
                for(int l = i; l >= 1; l--){
                    if(s.charAt(l - 1) == s.charAt(i - 1)) concat++;
                    else delete++;
                    if(j - delete >= 0){
                        dp[i][j] = Math.min(dp[i][j], dp[l-1][j-delete] + 1 + (concat >= 100 ? 3 : concat >= 10 ? 2 : concat >= 2 ? 1 : 0));
                    }
                }
                if(j > 0) dp[i][j] = Math.min(dp[i][j], dp[i-1][j-1]);
            }
        }
        return dp[len][k];
    }
}