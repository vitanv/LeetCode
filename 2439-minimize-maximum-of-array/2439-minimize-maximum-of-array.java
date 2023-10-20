class Solution {
    public int minimizeArrayValue(int[] nums) {
        long answer = 0, prefix = 0;
        for(int i = 0; i < nums.length; i++){
            prefix += nums[i];
            answer = Math.max(answer, (prefix + i) / (i + 1));
        }
        return (int) answer;
    }
}