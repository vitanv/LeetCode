class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        for(int i = 1; i < n; i++){
            answer[0] += nums[i] - nums[0];
        }
        for(int i = 1; i < n; i++){
            answer[i] = answer[i - 1] + (2*i - n) * (nums[i] - nums[i - 1]);
        }
        return answer;
    }
}