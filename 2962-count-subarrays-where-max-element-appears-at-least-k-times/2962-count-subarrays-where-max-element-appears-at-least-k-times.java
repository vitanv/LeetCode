class Solution {
    public long countSubarrays(int[] nums, int k) {
        long answer = 0;
        int left = 0, max = 0, count = 0;
        for(int num : nums){
            max = Math.max(max, num);
        }
        for(int right = 0; right < nums.length; right++){
            if(nums[right] == max) count++;
            while(k == count){
                if(nums[left] == max) count--;
                left++;
            }
            answer += left;
        }
        return answer;
    }
}