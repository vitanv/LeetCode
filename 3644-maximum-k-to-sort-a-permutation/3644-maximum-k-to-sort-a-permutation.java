class Solution {
    public int sortPermutation(int[] nums) {
        int n = nums.length, answer = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (nums[i] == i) {
                continue;
            }
            answer &= nums[i];
        }
        if(answer == Integer.MAX_VALUE) return 0;
        return answer;
    }
}