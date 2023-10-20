class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int n  = nums.length;
        int left = 0, right = nums[n - 1] - nums[0], mid = 0;
        while(left < right){
            mid = (right - left)/2 + left;
            if(countPairs(nums, mid) >= p){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
    public int countPairs(int[] nums, int mid){
        int idx = 0, count = 0;
        while(idx < nums.length - 1){
            if(nums[idx + 1] - nums[idx] <= mid){
                idx++;
                count++;
            }
            idx++;
        }
        return count;
    }
}