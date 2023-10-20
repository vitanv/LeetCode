class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            nums[index] = nums[i];
            if(nums[index] != 0) index++;
        }
        for(int i = index; i < nums.length;i++){
            nums[i] = 0;
        }
    }
}