class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0, right = 0, zero = 0, answer = 0;
        while(right < nums.length){
            if(nums[right] == 0) zero++;
            while(zero > 1){
                if(nums[left] == 0) zero--;
                left++;
            }
            right++;
            answer = Math.max(answer, right - left - 1);
            
        }
        return answer;
    }
}