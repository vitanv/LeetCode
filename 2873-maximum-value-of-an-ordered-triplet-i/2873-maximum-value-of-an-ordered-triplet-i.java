class Solution {

    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long answer = 0;
        for (int k = 2; k < n; k++) {
            int maxPrefix = nums[0];
            for (int j = 1; j < k; j++) {
                answer = Math.max(answer, (long) (maxPrefix - nums[j]) * nums[k]);
                maxPrefix = Math.max(maxPrefix, nums[j]);
            }
        }
        return answer;
    }
}