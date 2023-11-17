class Solution {
    public int minPairSum(int[] nums) {
        int left = 0, right = 0, answer = 0, n = nums.length - 1;
        Arrays.sort(nums);
        for(int i = 0; i <= n; i++){
            answer = Math.max(answer, nums[i] + nums[n - i]);
        }
        return answer;
    }
}