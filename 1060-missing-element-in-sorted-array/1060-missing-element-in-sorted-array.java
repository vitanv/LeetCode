class Solution {
    public int missingElement(int[] nums, int k) {
        for(int i = 1; i < nums.length; i++){
            int missed = nums[i] - nums[i - 1] - 1;
            if(missed >= k) return nums[i - 1] + k;
            k-= missed;
        }
        return nums[nums.length - 1] + k;
    }
}