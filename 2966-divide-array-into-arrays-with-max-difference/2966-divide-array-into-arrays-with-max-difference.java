class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int[][] answer = new int[n/3][3];
        for(int i = 0; i < n; i+= 3){
            if(nums[i + 2] - nums[i] > k) return new int[0][0];
            answer[i/3][0] = nums[i];
            answer[i/3][1] = nums[i+1];
            answer[i/3][2] = nums[i+2];
        }
        return answer;
    }
}