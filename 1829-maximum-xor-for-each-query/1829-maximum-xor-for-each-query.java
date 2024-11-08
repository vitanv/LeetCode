class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n = nums.length, mask = (1 << maximumBit) - 1;
        int[] answer = new int[n];
        int[] prefix = new int[n];
        prefix[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            prefix[i] = prefix[i - 1] ^ nums[i];
        }
        for(int i = 0; i < nums.length; i++){
            int curr = prefix[n - i - 1];
            answer[i] = curr ^ mask;
        }
        return answer;
    }
}