public class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int answer = 0;
        for (int i = nums.length - 1; i > 0; i--) {
            answer += nums[i] - nums[0];
        }
        return answer;
    }
}