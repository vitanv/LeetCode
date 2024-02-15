class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        long[] sum = new long[n];
        sum[0] = nums[0];
        for(int i = 1; i < n; i++){
            sum[i] += sum[i - 1] + nums[i];
        }
        for(int i = n - 1; i > 1; i--){
            if(nums[i] < sum[i - 1]) return nums[i] + sum[i - 1];
        }
        return -1;
    }
}