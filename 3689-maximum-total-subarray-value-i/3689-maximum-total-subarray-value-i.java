class Solution {

    public long maxTotalValue(int[] nums, int k) {
        int max1 = Integer.MAX_VALUE, max2 = Integer.MIN_VALUE;
        for (int num : nums) {
            max1 = Math.min(max1, num);
            max2 = Math.max(max2, num);
        }
        return (long) (max2 - max1) * k;
    }
}