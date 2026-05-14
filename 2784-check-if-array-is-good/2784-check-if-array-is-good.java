class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length;
        int[] freq = new int[n];
        for(int i = 0; i < n; i++){
            if(nums[i] >= n) return false;
            if(nums[i] < n - 1 && freq[nums[i]] > 0) return false;
            if(nums[i] == n - 1 && freq[nums[i]] > 1) return false;
            freq[nums[i]]++;
        }
        return true;
    }
}