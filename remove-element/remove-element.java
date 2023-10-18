class Solution {
    public int removeElement(int[] nums, int val) {
        int answer = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != val) {
                nums[answer] = nums[i];
                answer++;
            }
        }
        return answer;
    }
}