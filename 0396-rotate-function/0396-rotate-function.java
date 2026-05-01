class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length, sum = 0, f = 0;
        for(int i = 0; i < n; i++){
            f += i * nums[i];
            sum += nums[i];
        }
        int answer = f;
        for(int i = n - 1; i >= 1; i--){
            f = f + sum - n * nums[i];
            answer = Math.max(f, answer);
        }
        return answer;
    }
}