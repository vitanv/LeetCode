class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return count(nums, upper) - count(nums, lower - 1);
    }
    public long count(int[] nums, int limit){
        long answer = 0;
        for(int i = 0, j = nums.length - 1; i < j; i++){
            while(i < j && nums[i] + nums[j] > limit){
                j--;
            }
            answer += j - i;
        }
        return answer;
    }
}