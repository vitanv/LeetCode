class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0, answer = 0, curr = 0;
        for(int num: nums){
            max = Math.max(max, num);
        }
        for(int num: nums){
            if(num == max){
                curr++;
                answer = Math.max(curr, answer);
            }else{
                curr = 0;
            }
        }
        return answer;
    }
}