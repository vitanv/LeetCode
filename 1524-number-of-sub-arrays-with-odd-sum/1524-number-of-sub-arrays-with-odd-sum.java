class Solution {
    public int numOfSubarrays(int[] arr) {
        long odd = 0, even = 0, answer = 0; 
        int mod = (int)(1e9 + 7);
        for (int num : arr) {
            if (num % 2 == 1) {
                long newOdd = even + 1;
                long newEven = odd;
                odd = newOdd;
                even = newEven;
            } else {
                even = even + 1;
            }
            answer = (answer + odd) % mod;
        }
        return (int) answer;
    }
}