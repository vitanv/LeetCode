class Solution {
    public int maxFrequency(int[] nums, int k) {
        int left = 0, right = 0, answer = 0;
        long curr = 0;
        Arrays.sort(nums);
        while(right < nums.length){
            int target = nums[right];
            curr+= target;
            while((right - left + 1) * target - curr > k){
                curr -= nums[left];
                left++;
            }
            answer = Math.max(answer, right - left + 1);
            right++;
        }
        return answer;
    }
}