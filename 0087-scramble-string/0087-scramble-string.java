class Solution {
    public boolean isScramble(String s1, String s2) {
        int len = s1.length();
        boolean dp[][][] = new boolean[len + 1][len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                dp[1][i][j] = s1.charAt(i) == s2.charAt(j);
            }
        }
        for (int length = 2; length <= len; length++) {
            for (int i = 0; i < len + 1 - length; i++) {
                for (int j = 0; j < len + 1 - length; j++) {
                    for (int newLength = 1; newLength < length; newLength++) {
                        boolean dp1[] = dp[newLength][i];
                        boolean dp2[] = dp[length - newLength][i + newLength];
                        dp[length][i][j] |= dp1[j] && dp2[j + newLength];
                        dp[length][i][j] |= dp1[j + length - newLength] && dp2[j];
                    }
                }
            }
        }
        return dp[len][0][0];
    }
}