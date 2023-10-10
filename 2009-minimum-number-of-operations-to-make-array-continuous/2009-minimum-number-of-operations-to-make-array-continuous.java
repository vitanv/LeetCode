class Solution {
    public int minOperations(int[] nums) {
        int answer = nums.length, unique = 1;
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i - 1]) {
                nums[unique] = nums[i];
                unique++;
            }
        }
        for(int i = 0, j = 0; i < unique; i++){
            while(j < unique && nums[j] - nums[i] <= nums.length - 1){
                j++;
            }
            answer = Math.min(answer, nums.length - (j - i));
        }
        return answer;
    }
}