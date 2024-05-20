class Solution {
    public int subsetXORSum(int[] nums) {
        int answer = 0;
        for (int num : nums) {
            answer |= num;
        }
        return answer << (nums.length - 1);        
    }
}