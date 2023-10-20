class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int answer = 0, count = 0, index = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1) {
                count++;
            }else{
                count = i - index;
                index = i;
            }
            answer = Math.max(answer, count);
        }
        return answer;
    }
}