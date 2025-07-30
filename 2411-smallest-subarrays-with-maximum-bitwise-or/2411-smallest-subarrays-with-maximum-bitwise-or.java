class Solution {
    public int[] smallestSubarrays(int[] nums) {
        int n = nums.length;
        int[] lastSeen = new int[30];
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) answer[i] = 1;
        for (int i = n - 1; i >= 0; i--) {
            for (int bit = 0; bit < 30; bit++) {
                if ((nums[i] & (1 << bit)) > 0) lastSeen[bit] = i;
                answer[i] = Math.max(answer[i], lastSeen[bit] - i + 1);
            }
        }
        return answer;
    }
}