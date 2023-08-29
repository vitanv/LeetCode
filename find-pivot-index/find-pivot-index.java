class Solution {
    public int pivotIndex(int[] nums) {
        int sumLeft = 0, sumRight = 0;
        for(int num : nums){
            sumRight += num;
        }
        for(int i = 0; i < nums.length; i++){
            if(sumLeft == sumRight - sumLeft - nums[i]) return i;
            sumLeft += nums[i];
        }
        return -1;
    }
}