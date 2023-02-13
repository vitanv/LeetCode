class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for(int i = 0; i < nums.length;i++){
            nums[index] = nums[i];
            if(nums[index] != val) index++;
        }
        return index;
    }
}