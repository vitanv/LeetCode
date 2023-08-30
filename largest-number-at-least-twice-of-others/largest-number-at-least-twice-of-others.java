class Solution {
    public int dominantIndex(int[] nums) {
        int answer = 0, max = Integer.MIN_VALUE, n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] > max){
                max = nums[i];
                answer = i;
            }
        }
        for(int i = 0; i < n; i++){
            if(i != answer && 2*nums[i] > max) return -1;
        }
        return answer;
    }
}