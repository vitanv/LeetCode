class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        for(int i = 0; i < n; i++){
            answer[i] = nums[nums[i]];
        }
        return answer;
    }
}