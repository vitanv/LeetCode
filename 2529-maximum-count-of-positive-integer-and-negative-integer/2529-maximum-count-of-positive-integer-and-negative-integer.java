class Solution {
    public int maximumCount(int[] nums) {
        int count = 0, index = nums.length;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0) count++;
            if(nums[i] > 0){
                index = i;
                break;
            }
        }
        return Math.max(count, nums.length - index);
    }
}