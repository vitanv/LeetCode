class Solution {
    public int[] leftRightDifference(int[] nums) {
        int leftSum = nums[0], rightSum = nums[nums.length - 1];
        int[] answer = new int[nums.length];
        answer[0] = 0;
        for(int i = 1; i < nums.length; i++){
            answer[i] = leftSum;
            leftSum += nums[i];
        }
        for(int i = nums.length - 2; i >= 0; i--){
            answer[i] = Math.abs(answer[i] -rightSum);
            rightSum += nums[i];
        }
        return answer;
    }
}