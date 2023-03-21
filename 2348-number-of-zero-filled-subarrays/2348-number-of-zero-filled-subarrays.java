class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long answer = 0, count = 0;
        for(int num : nums){
            if(num == 0) {
                count++;
            }else{
                count = 0;
            }
            answer += count;
        }
        return answer;
    }
}