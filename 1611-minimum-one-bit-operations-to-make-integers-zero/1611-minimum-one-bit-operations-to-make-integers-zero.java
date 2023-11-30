class Solution {
    public int minimumOneBitOperations(int n) {
        int answer = 0, temp = 0, mask = 1;
        while(mask <= n){
            if((n & mask) != 0) answer = (1 << (temp + 1)) - 1 - answer;
            mask <<=1;
            temp++;
        }
        return answer;
    }
}