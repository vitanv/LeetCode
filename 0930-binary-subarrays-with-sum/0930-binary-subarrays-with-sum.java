class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int answer = 0, sum = 0;
        int[] prefix = new int[nums.length + 1];
        prefix[0] = 1;
        for(int num: nums){
            sum+= num;
            if(sum >= goal){
                answer += prefix[sum - goal];
            }
            prefix[sum]++;
        }
        return answer;
    }
}