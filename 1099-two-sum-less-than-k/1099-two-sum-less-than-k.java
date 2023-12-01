class Solution {
    public int twoSumLessThanK(int[] nums, int k) {
        int answer = -1, left = 0, right = nums.length - 1;
        Arrays.sort(nums);
        while(left < right){
            if(nums[right] >= k - nums[left]) right--;
            if(nums[right] < k - nums[left]){
                answer = Math.max(nums[right] + nums[left], answer);
                left++;
            }
        }
        return answer;
    }
}