class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] answer = new int[nums.length];
        int left = 0, right = nums.length - 1;
        for(int i = answer.length - 1; i>= 0; i--){
            if(nums[left] * nums[left] > nums[right] * nums[right]){
                
                answer[i] = nums[left] * nums[left];
                left++;
            }else{
                
                answer[i] = nums[right] * nums[right];
                right--;
            }
        }
        return answer;
    }
}