class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int prev = nums[nums.length - 1];
        for(int i = nums.length - 2; i>= 0; i--){
            
            if (nums[i] != prev){
                prev = nums[i];
                count++;
                if(count == 2) return nums[i];
            }
        }
        return nums[nums.length - 1];
    }
}