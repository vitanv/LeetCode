class Solution {
    public int minOperations(int[] nums, int k) {
        int finalBit = 0, answer = 0;
        for(int num : nums){
            finalBit = finalBit ^ num;
        }
        while(k > 0 || finalBit > 0){
            if( k % 2 != finalBit % 2) answer++;
            k /= 2;
            finalBit /= 2;
        }
        return answer;
    }
}