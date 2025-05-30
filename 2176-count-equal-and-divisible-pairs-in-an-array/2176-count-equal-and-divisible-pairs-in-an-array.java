class Solution {
    public int countPairs(int[] nums, int k) {
        int answer = 0, n = nums.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if((i * j) % k == 0 && nums[i] == nums[j]) answer++;
            }
        }
        return answer;
    }
}