class Solution {
    public int countOrders(int n) {
        long answer = 1, mod = (long)1_000_000_007;
        for(int i = 1; i <= n; i++){
            answer = answer * (i * 2 - 1) * i % mod;
        }
        return (int)answer;
    }
}