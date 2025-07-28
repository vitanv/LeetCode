class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int max = 0, answer = 0;
        for(int num: nums){
            max |= num;
        }
        int total = 1 << nums.length;
        for(int i = 0; i < total; i++){
            int curr = 0;
            for(int j = 0; j < nums.length; j++){
                if(((i >> j) & 1) == 1) curr |= nums[j]; 
            }
            if(curr == max) answer++;
        }
        return answer;
    }
}