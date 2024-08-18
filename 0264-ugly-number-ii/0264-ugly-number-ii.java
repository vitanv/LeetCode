class Solution {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        int index2 = 0, index3 = 0, index5 = 0, mult2 = 2, mult3 = 3, mult5 = 5;
        for(int i = 1; i < n; i++){
            int next = Math.min(mult2, Math.min(mult3, mult5));
            dp[i] = next;
            if(next == mult2){
                index2++;
                mult2 = dp[index2] * 2;
            }
            if(next == mult3){
                index3++;
                mult3 = dp[index3] * 3;
            }
            if(next == mult5){
                index5++;
                mult5 = dp[index5] * 5;
            }
        }
        return dp[n - 1];
    }
}