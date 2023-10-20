class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int answer = 0,  curr = 0;
        for(int n : nums){
            if(n == 1){
                curr++;
                
            }else{
                answer = Math.max(answer, curr);
                curr = 0;
            }
        }
        return Math.max(answer, curr);
    }
}