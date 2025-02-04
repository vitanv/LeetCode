class Solution {
    public int maxAscendingSum(int[] nums) {
        int answer = nums[0], sum = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i - 1]){
                sum+= nums[i];
            }else{
                sum = nums[i];
            }
            answer = Math.max(answer, sum); 
        }
        return answer;
    }
}