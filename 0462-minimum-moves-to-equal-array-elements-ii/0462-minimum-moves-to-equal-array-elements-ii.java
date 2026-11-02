class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int end = nums.length - 1, start= 0, answer = 0;
        while(start < end){
            answer += nums[end] - nums[start];
            start++;
            end--;
        }
        return answer;
    }
}