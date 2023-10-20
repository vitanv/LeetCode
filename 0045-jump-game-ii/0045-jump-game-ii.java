class Solution {
    public int jump(int[] nums) {
        int reach = 0, far = 0, answer = 0;
        for(int i = 0; i < nums.length - 1; i++){
            far = Math.max(far, i + nums[i]);
            if(i == reach){
                answer++;
                reach = far;
            }
            
        }
        return answer;
    }
}