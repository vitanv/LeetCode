class Solution {
    public long countCommas(long n) {
        long base = 1000, answer = 0;
        while (base <= n) {
            answer += n - base + 1;
            base *= 1000;
        }
        return answer;
    }
}