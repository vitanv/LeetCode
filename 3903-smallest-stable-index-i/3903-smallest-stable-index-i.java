class Solution {
    public int firstStableIndex(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            int maxValue = nums[i];
            int minValue = nums[i];
            for (int j = 0; j < i; j++) {
                maxValue = Math.max(maxValue, nums[j]);
            }
            for (int j = i + 1; j < nums.length; j++) {
                minValue = Math.min(minValue, nums[j]);
            }
            if (maxValue - minValue <= k) {
                return i;
            }
        }
        return -1;
    }
}