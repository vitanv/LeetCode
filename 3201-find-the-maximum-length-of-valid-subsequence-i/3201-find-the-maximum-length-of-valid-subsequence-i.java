class Solution {

    public int maximumLength(int[] nums) {
        int answer = 0;
        int[][] patterns = { { 0, 0 }, { 0, 1 }, { 1, 0 }, { 1, 1 } };
        for (int[] pattern : patterns) {
            int count = 0;
            for (int num : nums) {
                if (num % 2 == pattern[count % 2]) {
                    count++;
                }
            }
            answer = Math.max(answer, count);
        }
        return answer;
    }
}