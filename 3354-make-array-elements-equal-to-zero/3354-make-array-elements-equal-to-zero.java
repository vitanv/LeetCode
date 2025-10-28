class Solution {

    public int countValidSelections(int[] nums) {
        int n = nums.length, answer = 0, sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int leftSum = 0, rightSum = sum;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                if (leftSum - rightSum >= 0 && leftSum - rightSum <= 1) {
                    answer++;
                }
                if (rightSum - leftSum >= 0 && rightSum - leftSum <= 1) {
                    answer++;
                }
            } else {
                leftSum += nums[i];
                rightSum -= nums[i];
            }
        }
        return answer;
    }
}