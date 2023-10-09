class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] answer = {-1, -1};
        for(int i = 0; i < nums.length; i++){
            if(answer[0] == -1 && nums[i] == target) answer[0] = i;
            if(answer[0] != -1 && nums[i] > target) {
                answer[1] = i - 1;
                break;
            }
            if(answer[0] == -1 && nums[i] > target) return answer;
        }
        if(answer[0] != -1 && answer[1] == -1) answer[1] = nums.length - 1;
        return answer;
    }
}