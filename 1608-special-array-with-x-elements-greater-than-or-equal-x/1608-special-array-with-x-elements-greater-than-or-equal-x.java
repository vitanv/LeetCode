class Solution {
    public int specialArray(int[] nums) {
        int n = nums.length, count = 0;
        int[] freq = new int[n + 1];
        for(int i = 0; i < n; i++){
            freq[Math.min(n, nums[i])]++;
        }
        for(int i = n; i >= 1; i--){
            count += freq[i];
            if(i == count) return i;
        }
        return -1;
    }
}