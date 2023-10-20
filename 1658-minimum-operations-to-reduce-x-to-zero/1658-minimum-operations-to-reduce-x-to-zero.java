class Solution {
    public int minOperations(int[] nums, int x) {
        int total = 0, left = 0, max = -1, sum = 0;
        for(int num : nums){
            total += num;
        }
        for(int right = 0; right < nums.length; right++){
            sum += nums[right];
            while(sum > total - x && left <= right){
                sum-= nums[left];
                left++;
            
            }
            if(sum == total - x) max = Math.max(max, right - left + 1);
        }
        if(max > -1) return nums.length - max;
        return - 1;
    }
}