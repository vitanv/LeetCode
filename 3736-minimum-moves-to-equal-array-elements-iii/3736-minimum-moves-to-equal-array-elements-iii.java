class Solution {
    public int minMoves(int[] nums) {
        int answer = 0, max = nums[0];
        for(int num: nums){
            max = Math.max(max, num);
        }
        for(int num: nums){
            answer += max - num;
        }
        return answer;
    }
}