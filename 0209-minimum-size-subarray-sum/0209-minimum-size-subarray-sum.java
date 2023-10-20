class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, right = 0, sum = 0, answer = Integer.MAX_VALUE;
        while(right < nums.length){
            sum+= nums[right];
            while(sum >= target){
                answer = Math.min(answer, right - left +1);
                sum-= nums[left];
                left++;
            }
            right++;
        }
        if(answer == Integer.MAX_VALUE) return 0;
        return answer;
    }
}