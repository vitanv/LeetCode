class Solution {
    public long minimumReplacement(int[] nums) {
        long answer = 0;
        
        for(int i = nums.length - 2; i>= 0; i--){
            if(nums[i] > nums[i+1]){
                long count = (long)(nums[i] + nums[i + 1] - 1) / (long)nums[i + 1];
                answer += count - 1;
                nums[i] = nums[i] / (int)count;
            }
        }
        return answer;
    }
}