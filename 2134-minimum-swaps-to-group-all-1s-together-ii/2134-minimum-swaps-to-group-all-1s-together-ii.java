class Solution {
    public int minSwaps(int[] nums) {
        int answer = Integer.MAX_VALUE, count = 0;
        for(int num : nums){
            if(num == 1) count++;
        }
        int ones = nums[0], right = 0;
        for(int left = 0; left < nums.length; left++){
            if(left != 0){
                ones -= nums[left - 1];
            }
            while(right - left + 1 < count){
                right++;
                ones += nums[right % nums.length];
            }
            answer = Math.min(answer, count - ones);
        }
        return answer;
    }
}