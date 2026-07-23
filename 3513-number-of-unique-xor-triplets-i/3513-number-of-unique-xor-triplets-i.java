class Solution {

    public int uniqueXorTriplets(int[] nums) {
        int answer = 1, n = nums.length;
        if (n <= 2) {
            return n;
        }
        while (answer <= n) {
            answer <<= 1;
        }
        return answer;
    }
}