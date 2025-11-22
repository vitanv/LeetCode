class Solution {
    public int minimumOperations(int[] nums) {
        int answer = 0;
        for (int x : nums) {
            int rem = x % 3;
            answer += Math.min(rem, 3 - rem);
        }
        return answer;
    }
}